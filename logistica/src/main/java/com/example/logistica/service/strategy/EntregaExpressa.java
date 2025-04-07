package com.example.logistica.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements FreteStrategy {
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.50;
    }
    @Override
    public String tipo(){
        return "Expressa";
    }
}
