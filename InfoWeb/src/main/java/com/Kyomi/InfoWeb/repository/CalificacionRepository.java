package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Calificacion;

import java.math.BigDecimal;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {

    @Procedure(procedureName = "FIDE_REGISTRAR_CALIFICACION_SP")
    void registrarCalificacion(
        @Param("P_ID_USUARIO") Long idUsuario,
        @Param("P_ID_NOTICIA") Long idNoticia,
        @Param("P_PUNTAJE") Integer puntaje
    );

    @Procedure(procedureName = "FIDE_PROMEDIO_CALIFICACION_SP")
    BigDecimal obtenerPromedioCalificacion(
        @Param("P_ID_NOTICIA") Long idNoticia
    );
}
