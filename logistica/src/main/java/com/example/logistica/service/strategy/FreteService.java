package com.example.logistica.service.strategy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class FreteService {
    private static final Map<String, FreteStrategy> estrategias = new HashMap<>();

    static {
        estrategias.put("expressa", new EntregaExpressa());
        estrategias.put("economica", new EntregaEconomica());
        estrategias.put("terceirizada", new TransportadoraTerceirizada());
    }

    public static double calcular(String tipo, double peso) {
        FreteStrategy estrategia = estrategias.get(tipo.toLowerCase());
        if (estrategia == null) throw new IllegalArgumentException("Tipo de entrega inválido");
        return estrategia.calcularFrete(peso);
    }
}