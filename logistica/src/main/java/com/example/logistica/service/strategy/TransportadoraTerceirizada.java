package com.example.logistica.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraTerceirizada implements FreteStrategy{
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.20;
    }

    @Override
    public String tipo(){
        return "Terceirizada";
    }


}
