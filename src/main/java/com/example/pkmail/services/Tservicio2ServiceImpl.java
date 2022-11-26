package com.example.pkmail.services;

import com.example.pkmail.entities.Tservicio2;
import com.example.pkmail.repository.Tservicio2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tservicio2ServiceImpl implements Tservicio2Service {
    @Autowired
    private Tservicio2Repository tservicio2Repositorio;

    @Override
    public List<Tservicio2> enviosxtservicio2() {
        return tservicio2Repositorio.enviosxtservicio2();
    }
}
