package com.bbva.contractmicroservice.controller;

import com.bbva.contractmicroservice.dto.ContractDTO;
import com.bbva.contractmicroservice.entity.Contract;
import com.bbva.contractmicroservice.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/contrato")
public class ContractController {

    private final IContractService contractService;
    @Autowired
    public ContractController(IContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/listar-contratos")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ContractDTO>> listarContratos() {
        List<ContractDTO> contratos = contractService.findAll();
        if (!contratos.isEmpty()) {
            return ResponseEntity.ok(contratos);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/ver/{accountId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ContractDTO> getContractById(@PathVariable Long accountId) {
        ContractDTO contract = contractService.findById(accountId);
        if (contract != null) {
            return ResponseEntity.ok(contract);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Contract registrarContrato(@RequestBody ContractDTO contract) {
        return contractService.save(contract);
    }

    @PostMapping("/open-term-deposit")
    public ResponseEntity<Object> openTermDeposit(@RequestBody ContractDTO contractDTO) {
        try {
            Contract contract = contractService.save(contractDTO);

            BigDecimal inversion = contractDTO.getAccount().getSaldo();
            BigDecimal ganancia = contractDTO.getGanancia();
            BigDecimal totalRecibir = inversion.add(ganancia);

            // Crear el JSON de respuesta para apertura exitosa
            Map<String, Object> successResponse = new HashMap<>();
            successResponse.put("status", "success");
            successResponse.put("message", "Apertura de deposito a plazo exitosa");
            successResponse.put("cuenta", Map.of(
                    //"id", contract.getIdContrato(),
                    "fechaDeposito", LocalDate.now(),
                    "hora", LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")),
                    "inversion", inversion,
                    "gananciaTotal", ganancia,
                    "TREA", contract.getInterestRate().getTasaInteres(),
                    "TotalRecibir", totalRecibir,
                    "cuentaCorriente", contractDTO.getCuentaDepositoInte()
            ));

            return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
        } catch (Exception e) {
            // Crear el JSON de respuesta para apertura erronea
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status", "error");
            errorResponse.put("message", "No se pudo aperturar el deposito a plazo.");
            errorResponse.put("error", e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/eliminar-contrato/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarContrato(@PathVariable Long id) {
        contractService.deleteById(id);
    }

    /////////////////////////////////////////////////////////////////////////////////

}

