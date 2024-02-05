package com.bbva.contractmicroservice.mapper;

import com.bbva.contractmicroservice.dto.AccountDTO;
import com.bbva.contractmicroservice.dto.ContractDTO;
import com.bbva.contractmicroservice.dto.InterestRateDTO;
import com.bbva.contractmicroservice.dto.ProductoDTO;
import com.bbva.contractmicroservice.entity.Contract;
import com.bbva.contractmicroservice.model.Account;
import com.bbva.contractmicroservice.model.InterestRate;
import com.bbva.contractmicroservice.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T12:48:36-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240129-0421, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class ContractMapperImpl implements ContractMapper {

    @Override
    public ContractDTO toDto(Contract contract) {
        if ( contract == null ) {
            return null;
        }

        ContractDTO contractDTO = new ContractDTO();

        contractDTO.setAccount( accountToAccountDTO( contract.getAccount() ) );
        contractDTO.setCuentaDepositoInte( contract.getCuentaDepositoInte() );
        contractDTO.setCuentaOrigen( contract.getCuentaOrigen() );
        contractDTO.setFechaInicio( contract.getFechaInicio() );
        contractDTO.setFechaVencimiento( contract.getFechaVencimiento() );
        contractDTO.setGanancia( contract.getGanancia() );
        contractDTO.setIdContrato( contract.getIdContrato() );
        contractDTO.setInterestRate( interestRateToInterestRateDTO( contract.getInterestRate() ) );
        contractDTO.setProduct( productToProductoDTO( contract.getProduct() ) );

        return contractDTO;
    }

    @Override
    public Contract toEntity(ContractDTO contractDTO) {
        if ( contractDTO == null ) {
            return null;
        }

        Contract contract = new Contract();

        contract.setAccount( accountDTOToAccount( contractDTO.getAccount() ) );
        contract.setCuentaDepositoInte( contractDTO.getCuentaDepositoInte() );
        contract.setCuentaOrigen( contractDTO.getCuentaOrigen() );
        contract.setFechaInicio( contractDTO.getFechaInicio() );
        contract.setFechaVencimiento( contractDTO.getFechaVencimiento() );
        contract.setGanancia( contractDTO.getGanancia() );
        contract.setIdContrato( contractDTO.getIdContrato() );
        contract.setInterestRate( interestRateDTOToInterestRate( contractDTO.getInterestRate() ) );
        contract.setProduct( productoDTOToProduct( contractDTO.getProduct() ) );

        return contract;
    }

    @Override
    public List<ContractDTO> toDtoList(List<Contract> contracts) {
        if ( contracts == null ) {
            return null;
        }

        List<ContractDTO> list = new ArrayList<ContractDTO>( contracts.size() );
        for ( Contract contract : contracts ) {
            list.add( toDto( contract ) );
        }

        return list;
    }

    protected AccountDTO accountToAccountDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setEstadoCuenta( account.getEstadoCuenta() );
        accountDTO.setFechaApertura( account.getFechaApertura() );
        accountDTO.setIdCuenta( account.getIdCuenta() );
        accountDTO.setSaldo( account.getSaldo() );

        return accountDTO;
    }

    protected InterestRateDTO interestRateToInterestRateDTO(InterestRate interestRate) {
        if ( interestRate == null ) {
            return null;
        }

        InterestRateDTO interestRateDTO = new InterestRateDTO();

        interestRateDTO.setIdPlazo( interestRate.getIdPlazo() );
        interestRateDTO.setIdTasaInteres( interestRate.getIdTasaInteres() );
        interestRateDTO.setTasaInteres( interestRate.getTasaInteres() );

        return interestRateDTO;
    }

    protected ProductoDTO productToProductoDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setDescripcion( product.getDescripcion() );
        productoDTO.setIdProducto( product.getIdProducto() );
        productoDTO.setTipoProducto( product.getTipoProducto() );

        return productoDTO;
    }

    protected Account accountDTOToAccount(AccountDTO accountDTO) {
        if ( accountDTO == null ) {
            return null;
        }

        Account account = new Account();

        account.setEstadoCuenta( accountDTO.getEstadoCuenta() );
        account.setFechaApertura( accountDTO.getFechaApertura() );
        account.setIdCuenta( accountDTO.getIdCuenta() );
        account.setSaldo( accountDTO.getSaldo() );

        return account;
    }

    protected InterestRate interestRateDTOToInterestRate(InterestRateDTO interestRateDTO) {
        if ( interestRateDTO == null ) {
            return null;
        }

        InterestRate interestRate = new InterestRate();

        interestRate.setIdPlazo( interestRateDTO.getIdPlazo() );
        interestRate.setIdTasaInteres( interestRateDTO.getIdTasaInteres() );
        interestRate.setTasaInteres( interestRateDTO.getTasaInteres() );

        return interestRate;
    }

    protected Product productoDTOToProduct(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setDescripcion( productoDTO.getDescripcion() );
        product.setIdProducto( productoDTO.getIdProducto() );
        product.setTipoProducto( productoDTO.getTipoProducto() );

        return product;
    }
}
