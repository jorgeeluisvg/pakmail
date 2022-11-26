package com.example.pkmail.repository;

import com.example.pkmail.entities.Cliente;
import com.example.pkmail.entities.FcontactoSucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FcontactoSucursalRepository extends JpaRepository<FcontactoSucursal,Long> {
    //EnviosFcontactoSucursal
    @Query(value = "SELECT forma_de_contacto,sucursal,sum(costo) AS costo,count(costo) AS cantidad from temporal where forma_de_contacto = :fcontacto AND sucursal = :suc",nativeQuery = true)
    List<FcontactoSucursal> enviosxfcontactosucursal(@Param("fcontacto") String fcontactoe, @Param("suc") String suc);
}
