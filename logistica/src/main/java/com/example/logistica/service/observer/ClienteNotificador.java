package com.example.logistica.service.observer;

public class ClienteNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando: " + mensagem);
    }
}
