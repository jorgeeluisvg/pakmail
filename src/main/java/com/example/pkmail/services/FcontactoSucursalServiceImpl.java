package com.example.pkmail.services;


import com.example.pkmail.entities.FcontactoSucursal;
import com.example.pkmail.repository.FcontactoSucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FcontactoSucursalServiceImpl implements FcontactoSucursalService{

    @Autowired
    FcontactoSucursalRepository repositorioFcontactoSucursal;


    @Override
    public List<FcontactoSucursal> enviosxfcontactosucursal(String fcontacto, String suc) {
        return repositorioFcontactoSucursal.enviosxfcontactosucursal(fcontacto,suc);
    }
}
