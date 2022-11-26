package com.example.pkmail.services;

import com.example.pkmail.entities.Cliente2;
import com.example.pkmail.repository.Cliente2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cliente2Impl implements Cliente2Service {
    @Autowired
    private Cliente2Repository repositorioCliente2;

    @Override
    public List<Cliente2> enviosxcliente2() {
        return repositorioCliente2.enviosxcliente2();
    }
}
