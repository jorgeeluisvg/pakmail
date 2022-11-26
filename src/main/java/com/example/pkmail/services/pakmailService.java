package com.example.pkmail.services;

import com.example.pkmail.entities.pakmail;

import java.util.List;

public interface pakmailService {
    List<pakmail> findAllByMensajeriaEquals(String xmensajeria);
    List<pakmail> findAllByClienteEquals(String xcliente);
    List<pakmail> findAllByForma_de_contactoAndSucursalEquals(String xfcontacto,String xsucursal);

}
