package com.example.logistica.service.strategy;

import org.springframework.stereotype.Component;


public class EntregaExpressa implements FreteStrategy {

    public double calcularFrete(double peso) {
        return peso * 0.50;
    }
    public String tipo(){
        return "Expressa";
    }
}
