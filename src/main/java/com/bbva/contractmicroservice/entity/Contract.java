package com.bbva.contractmicroservice.entity;

import com.bbva.contractmicroservice.model.Account;
import com.bbva.contractmicroservice.model.InterestRate;
import com.bbva.contractmicroservice.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Table(name="Contrato")
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrato;
    @Column(name="fechaInicio")
    private LocalDate fechaInicio;
    @Column(name="fechaVencimiento")
    private LocalDate fechaVencimiento;
    @Column(name="cuentaOrigen")
    private String cuentaOrigen;
    @Column(name="cuentaDepositoInte")
    private String cuentaDepositoInte;
    @Column(name="ganancia")
    private BigDecimal ganancia;

    @OneToOne
    @JoinColumn(name = "idCuenta")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "idTasaInteres")
    private InterestRate interestRate;

    @OneToOne
    @JoinColumn(name = "idProducto")
    private Product product;

    public Contract() {
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public InterestRate getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(InterestRate interestRate) {
        this.interestRate = interestRate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Contract(Long idContrato, LocalDate fechaInicio, LocalDate fechaVencimiento, String cuentaOrigen, String cuentaDepositoInte, BigDecimal ganancia, Account account, InterestRate interestRate, Product product) {
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
}
