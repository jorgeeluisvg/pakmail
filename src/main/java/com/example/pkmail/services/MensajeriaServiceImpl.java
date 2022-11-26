package com.example.pkmail.services;


import com.example.pkmail.entities.Mensajeria;
import com.example.pkmail.repository.MensajeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeriaServiceImpl implements MensajeriaService {
    @Autowired
    private MensajeriaRepository repositorioMensajeria;

    @Override
    public List<Mensajeria> enviosxmensajeria(String mensajeria,String mes) {
        return repositorioMensajeria.enviosxmensajeria(mensajeria,mes);
    }
}
