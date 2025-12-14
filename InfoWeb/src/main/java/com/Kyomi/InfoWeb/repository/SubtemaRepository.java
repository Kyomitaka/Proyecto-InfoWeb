package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Subtema;

public interface SubtemaRepository extends JpaRepository<Subtema, Long> {

    @Procedure(procedureName = "FIDE_INSERT_SUBTEMA_SP")
    void insertarSubtema(
        @Param("P_ID_TEMA") Long idTema,
        @Param("P_NOMBRE") String nombre,
        @Param("P_DESCRIPCION") String descripcion,
        @Param("P_ID_ESTADO") Long idEstado
    );

    @Procedure(procedureName = "FIDE_UPDATE_SUBTEMA_SP")
    void actualizarSubtema(
        @Param("P_ID_SUBTEMA") Long idSubtema,
        @Param("P_ID_TEMA") Long idTema,
        @Param("P_NOMBRE") String nombre,
        @Param("P_DESCRIPCION") String descripcion,
        @Param("P_ID_ESTADO") Long idEstado
    );
}
