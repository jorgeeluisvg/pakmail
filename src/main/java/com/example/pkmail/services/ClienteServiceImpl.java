package com.example.pkmail.services;

import com.example.pkmail.entities.Cliente;
import com.example.pkmail.entities.Mensajeria;
import com.example.pkmail.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository repositorioCliente;

    @Override
    public List<Cliente> enviosxcliente(String cliente, String mes) {
        return repositorioCliente.enviosxcliente(cliente,mes);
    }
}
