package com.example.logistica.service.observer;

import org.springframework.stereotype.Component;

@Component
public class InternoNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando equipe: " + mensagem);
    }
}