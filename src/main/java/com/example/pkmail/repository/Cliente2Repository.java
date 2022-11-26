package com.example.pkmail.repository;


import com.example.pkmail.entities.Cliente2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Cliente2Repository extends JpaRepository<Cliente2,Long> {
    //enviosCliente
    @Query(value = "select Distinct C.cliente, \n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 1 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Enero,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 1 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Enero_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 2 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Febrero,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 2 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Febrero_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 3 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Marzo,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 3 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Marzo_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 4 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Abril,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 4 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Abril_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 5 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Mayo,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 5 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Mayo_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 6 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Junio,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 6 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Junio_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 7 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Julio,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 7 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Julio_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 8 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Agosto,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 8 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Agosto_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 9 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Septiembre,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 9 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Septiembre_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 10 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Octubre,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 10 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Octubre_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 11 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Noviembre,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 11 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Noviembre_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 12 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Diciembre,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 12 AND H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Diciembre_impor,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Total,\n" +
            "COALESCE((SELECT CONCAT(sum(importe)) FROM h_envios H where H.id_cliente=C.id_cliente AND year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))=E.anio group by C.cliente, year(STR_TO_DATE(id_fecha, \"%Y%m%d\"))),0) Total_impor,\n" +
            "E.anio\n" +
            "from (select distinct  id_cliente,year(STR_TO_DATE(id_fecha, \"%Y%m%d\")) anio from h_envios) E\n" +
            "Left join d_cliente C ON E.id_cliente = C.id_cliente\n" +
            "where C.cliente like \"%%\" AND E.anio like \"%%\"\n" +
            "group by C.id_cliente,E.anio",nativeQuery = true)
    List<Cliente2> enviosxcliente2();
}
