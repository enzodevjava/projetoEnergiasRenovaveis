package br.com.energiarenovavel.projetoEnergiasRenovaveis.dto;

import java.time.LocalDateTime;

public class GeracaoEnergiaDTO {

    private double energiaGerada;
    private double energiaArmazenada;
    private LocalDateTime dataHora;

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public double getEnergiaArmazenada() {
        return energiaArmazenada;
    }

    public void setEnergiaArmazenada(double energiaArmazenada) {
        this.energiaArmazenada = energiaArmazenada;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }
}
