package com.bbva.contractmicroservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="Tasa_interes")
@Entity
public class InterestRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTasaInteres;
    private String tasaInteres;
    private Long idPlazo;

    public InterestRate() {
    }

    public InterestRate(Long idTasaInteres, String tasaInteres, Long idPlazo) {
        this.idTasaInteres = idTasaInteres;
        this.tasaInteres = tasaInteres;
        this.idPlazo = idPlazo;
    }

    public Long getIdTasaInteres() {
        return idTasaInteres;
    }

    public void setIdTasaInteres(Long idTasaInteres) {
        this.idTasaInteres = idTasaInteres;
    }

    public String getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(String tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Long getIdPlazo() {
        return idPlazo;
    }

    public void setIdPlazo(Long idPlazo) {
        this.idPlazo = idPlazo;
    }
}
