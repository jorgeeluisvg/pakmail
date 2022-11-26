package com.example.pkmail.repository;

import com.example.pkmail.entities.Cliente;
import com.example.pkmail.entities.Mensajeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    //EnviosCliente
    @Query(value = "SELECT cliente,sum(costo) AS costo,count(costo) AS cantidad from temporal where cliente = :cliente AND MONTH(fecha_envio) = :mes",nativeQuery = true)
    List<Cliente> enviosxcliente(@Param("cliente") String cliente, @Param("mes") String mes);
}

