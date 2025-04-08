package com.example.logistica.controller;

import com.example.logistica.service.observer.ClienteNotificador;
import com.example.logistica.service.observer.InternoNotificador;
import com.example.logistica.service.observer.SistemaNotificacao;
import com.example.logistica.service.strategy.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    private final FreteService freteService;
    private final SistemaNotificacao sistemaNotificacao;

    // Injeção de dependência pelo construtor
    public EntregaController(FreteService freteService, SistemaNotificacao sistemaNotificacao) {
        this.freteService = freteService;
        this.sistemaNotificacao = sistemaNotificacao;

        // Adicionando os notificadores ao sistema
        sistemaNotificacao.notificar(new ClienteNotificador().toString());
        sistemaNotificacao.notificar(new InternoNotificador().toString());
    }

    @GetMapping("/calcular")
    public String calcularFrete(@RequestParam String tipo ,@RequestParam double peso) {
        double valorFrete = FreteService.calcular(tipo, peso);

        sistemaNotificacao.notificar("Entrega concluída! Valor do frete: R$ " + valorFrete);
        return "Frete: R$" + valorFrete;
    }
}
