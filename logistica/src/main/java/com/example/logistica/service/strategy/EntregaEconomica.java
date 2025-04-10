package com.example.logistica.service.strategy;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements FreteStrategy {
    public double calcularFrete(double peso) {
        return peso * 0.10;
    }

    public String tipo() {
        return "Economica";
    }
}