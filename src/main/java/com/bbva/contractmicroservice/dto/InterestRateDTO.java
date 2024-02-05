package com.bbva.contractmicroservice.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)// si no hay getter ni setter
public class InterestRateDTO {
    private Long idTasaInteres;
    private String tasaInteres;
    private Long idPlazo;

    public InterestRateDTO() {
    }

    public InterestRateDTO(Long idTasaInteres, String tasaInteres, Long idPlazo) {
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
