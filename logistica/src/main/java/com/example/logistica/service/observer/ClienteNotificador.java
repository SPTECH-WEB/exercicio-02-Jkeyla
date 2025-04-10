package com.example.logistica.service.observer;

import org.springframework.stereotype.Component;

@Component
public class ClienteNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando: " + mensagem);
    }
}