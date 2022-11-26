package com.example.pkmail.repository;

import com.example.pkmail.entities.Mensajeria2;
import com.example.pkmail.entities.Tservicio2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tservicio2Repository extends JpaRepository<Tservicio2,Long> {
    //enviosMensajeria2
    @Query(value = "select Distinct TS.tipo_servicio, \n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 1 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Enero,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 2 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Febrero,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 3 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Marzo,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 4 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Abril,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 5 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Mayo,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 6 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Junio,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 7 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Julio,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 8 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Agosto,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 9 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Septiembre,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 10 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Octubre,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 11 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Noviembre,\n" +
            "COALESCE((SELECT count(*) FROM h_envios H where month(STR_TO_DATE(id_fecha, \"%Y%m%d\")) = 12 AND H.id_tipo_servicio=TS.id_tipo_servicio AND H.id_mensajeria=me.id_mensajeria group by TS.id_tipo_servicio,H.id_mensajeria),0) Diciembre\n" +
            "from (select distinct id_tipo_servicio, id_mensajeria from h_envios) E\n" +
            "Left join d_tipo_servicio TS ON E.id_tipo_servicio = TS.id_tipo_servicio  \n" +
            "Left join d_mensajeria me ON E.id_mensajeria = me.id_mensajeria\n" +
            "group by TS.tipo_servicio,me.id_mensajeria",nativeQuery = true)
    List<Tservicio2> enviosxtservicio2();
}
