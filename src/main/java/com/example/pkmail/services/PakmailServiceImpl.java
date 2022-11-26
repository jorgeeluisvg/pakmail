package com.example.pkmail.services;


import com.example.pkmail.entities.pakmail;
import com.example.pkmail.repository.PakmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PakmailServiceImpl implements pakmailService {

    private List<pakmail> mensajeria = new ArrayList<>();
    @Autowired
    private PakmailRepository repositorio;

    @Override
    public List<pakmail> findAllByMensajeriaEquals(String xmensajeria) {
        return repositorio.findAllByMensajeriaEquals(xmensajeria);
    }


    @Override
    public List<pakmail> findAllByClienteEquals(String xcliente) {
        return repositorio.findAllByClienteEquals(xcliente);
    }

    @Override
    public List<pakmail> findAllByForma_de_contactoAndSucursalEquals(String xfcontacto, String xsucursal) {
        return repositorio.buscarporFcontactoSucursal(xfcontacto,xsucursal);
    }


}
