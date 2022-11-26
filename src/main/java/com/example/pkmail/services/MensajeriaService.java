package com.example.pkmail.services;

import com.example.pkmail.entities.Mensajeria;

import java.util.List;

public interface MensajeriaService {
    List<Mensajeria> enviosxmensajeria(String mensajeria,String mes);
}
