package com.example.logistica.service.strategy;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FreteService {
    public final List<FreteStrategy> estrategias;

    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String tipo, double peso) {
        return estrategias.stream()
                .filter(e -> e.tipo().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de Frete inválido!"))
                .calculaFrete(peso);
    }
}
