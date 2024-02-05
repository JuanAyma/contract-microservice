package com.bbva.contractmicroservice.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)// si no hay getter ni setter
public class AccountDTO {
    private Long idCuenta;
    private BigDecimal saldo;
    private LocalDate fechaApertura;
    private String estadoCuenta;

    private Long customer;
    private Long currency;

    public AccountDTO() {
    }

    public AccountDTO(Long idCuenta, BigDecimal saldo, LocalDate fechaApertura, String estadoCuenta, Long customer, Long currency) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estadoCuenta = estadoCuenta;
        this.customer = customer;
        this.currency = currency;
    }

    public Long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public Long getCurrency() {
        return currency;
    }

    public void setCurrency(Long currency) {
        this.currency = currency;
    }
}

