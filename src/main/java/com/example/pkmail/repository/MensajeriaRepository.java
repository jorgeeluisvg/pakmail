package com.example.pkmail.repository;

import com.example.pkmail.entities.Mensajeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MensajeriaRepository extends JpaRepository<Mensajeria,Long> {
    //EnviosMensajeria
    @Query(value = "SELECT mensajeria,sum(costo) AS costo,count(costo) AS cantidad from temporal where mensajeria = :mensajeria AND MONTH(fecha_envio) = :mes",nativeQuery = true)
    List<Mensajeria> enviosxmensajeria(@Param("mensajeria") String mensajeria,@Param("mes") String mes);
}
