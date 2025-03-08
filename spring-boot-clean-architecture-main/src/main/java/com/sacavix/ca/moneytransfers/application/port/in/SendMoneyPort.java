package com.sacavix.ca.moneytransfers.application.port.in;

public interface SendMoneyPort {
    //No se necesita implementacion
    //Unicamente se necesita recibir sendMoneyCommand
    public boolean send(SendMoneyCommand command);
}
