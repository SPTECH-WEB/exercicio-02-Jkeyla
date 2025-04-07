package com.example.logistica.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements FreteStrategy {
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.10;
    }

    @Override
    public String tipo(){
        return "Economica";
    }
}
