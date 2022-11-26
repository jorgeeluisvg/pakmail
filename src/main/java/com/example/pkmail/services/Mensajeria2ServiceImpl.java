package com.example.pkmail.services;

import com.example.pkmail.entities.Mensajeria2;
import com.example.pkmail.repository.Mensajeria2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mensajeria2ServiceImpl implements Mensajeria2Service{
    @Autowired
    private Mensajeria2Repository repositorioMensajeria2;

    @Override
    public List<Mensajeria2> enviosxmensajeria2() {
        return repositorioMensajeria2.enviosxmensajeria2();
    }
}
