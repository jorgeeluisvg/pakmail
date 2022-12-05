package com.example.pkmail.services;

import com.example.pkmail.entities.FcontactoSucursal2;
import com.example.pkmail.repository.FcontactoSucursal2Repository;
import com.example.pkmail.repository.Mensajeria2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FcontactoSucursal2Impl implements  FcontactoSucursal2Service{
    @Autowired
    private FcontactoSucursal2Repository repositorioFcontactoSucursal2;

    @Override
    public List<FcontactoSucursal2> enviosxfcontactosucursal2(String anioo) {
        return repositorioFcontactoSucursal2.enviosxfcontactosucursal2(anioo);
    }


}
