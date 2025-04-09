package com.example.logistica.service.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SistemaNotificacao implements Notificador {
    private List<Notificador> notificadores = new ArrayList<Notificador>();

    @Autowired
    public SistemaNotificacao(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    @Override
    public void notificar(String mensagem) {
        for (Notificador notificador : notificadores) {
            notificador.notificar(mensagem);
        }
    }
}