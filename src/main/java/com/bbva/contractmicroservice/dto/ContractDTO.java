package com.bbva.contractmicroservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)// si no hay getter ni setter
public class ContractDTO {

    private Long idContrato;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private String cuentaOrigen;
    private String cuentaDepositoInte;
    private BigDecimal ganancia;

    private AccountDTO account;
    private InterestRateDTO interestRate;
    private ProductoDTO product;

    public ContractDTO() {
    }

    public ContractDTO(Long idContrato, LocalDate fechaInicio, LocalDate fechaVencimiento, String cuentaOrigen, String cuentaDepositoInte, BigDecimal ganancia, AccountDTO account, InterestRateDTO interestRate, ProductoDTO product) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDepositoInte = cuentaDepositoInte;
        this.ganancia = ganancia;
        this.account = account;
        this.interestRate = interestRate;
        this.product = product;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDepositoInte() {
        return cuentaDepositoInte;
    }

    public void setCuentaDepositoInte(String cuentaDepositoInte) {
        this.cuentaDepositoInte = cuentaDepositoInte;
    }

    public BigDecimal getGanancia() {
        return ganancia;
    }

    public void setGanancia(BigDecimal ganancia) {
        this.ganancia = ganancia;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    public InterestRateDTO getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(InterestRateDTO interestRate) {
        this.interestRate = interestRate;
    }

    public ProductoDTO getProduct() {
        return product;
    }

    public void setProduct(ProductoDTO product) {
        this.product = product;
    }
}
