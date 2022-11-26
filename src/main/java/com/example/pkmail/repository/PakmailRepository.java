package com.example.pkmail.repository;
import com.example.pkmail.entities.pakmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PakmailRepository extends JpaRepository<pakmail,Long> {

    //sql native
    @Query(value = "SELECT * FROM temporal WHERE mensajeria = DHL NACIONAL",nativeQuery = true)
            List<pakmail> buscarporMensajeria(String xmensajeria);

    //querymethod
    List<pakmail> findAllByMensajeriaEquals(String xmensajeria);


    //querymethod clientes
    List<pakmail> findAllByClienteEquals(String xcliente);

    //querymethod fcontacto_sucursal
    @Query(value = "SELECT * from temporal where forma_de_contacto = :fcontacto And sucursal = :sucursal",nativeQuery = true)
        List<pakmail> buscarporFcontactoSucursal(@Param("fcontacto") String fcontacto, @Param("sucursal") String sucursal);

}
