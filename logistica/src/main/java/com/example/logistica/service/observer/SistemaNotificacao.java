package com.example.logistica.service.observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificacao {
    private final List<Notificador> notificadores = new ArrayList<Notificador>();

    public SistemaNotificacao(Notificador notificador) {
        notificadores.add(notificador);
    }

    public void notificar(String mensagem) {
        for (Notificador notificador : notificadores) {
            notificador.notificar(mensagem);
        }
    }
}