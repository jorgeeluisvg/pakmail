package com.example.pkmail.services;

import com.example.pkmail.entities.Cliente;
import com.example.pkmail.entities.FcontactoSucursal;
import com.example.pkmail.entities.Mensajeria;

import java.util.List;

public interface FcontactoSucursalService {
    List<FcontactoSucursal> enviosxfcontactosucursal(String fcontacto, String suc);
}
