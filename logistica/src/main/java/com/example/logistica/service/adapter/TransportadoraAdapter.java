package com.example.logistica.service.adapter;

import org.springframework.stereotype.Service;

@Service("externo")
public class TransportadoraAdapter implements TransportadoraExterna {
    @Override
    public double calcularFreteExterno(double peso) {
        return peso * 7.5;
    }
}
