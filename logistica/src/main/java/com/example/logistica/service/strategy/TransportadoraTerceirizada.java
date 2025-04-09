package com.example.logistica.service.strategy;

import org.springframework.stereotype.Component;


public class TransportadoraTerceirizada implements FreteStrategy{
    public double calcularFrete(double peso) {
        return peso * 0.20;
    }

    public String tipo(){
        return "Terceirizada";
    }


}
