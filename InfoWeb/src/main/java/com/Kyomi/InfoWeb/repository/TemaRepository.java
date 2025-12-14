package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

    @Procedure(procedureName = "FIDE_INSERT_TEMA_SP")
    void insertarTema(
        @Param("P_NOMBRE") String nombre,
        @Param("P_DESCRIPCION") String descripcion,
        @Param("P_ID_ESTADO") Long idEstado
    );

    @Procedure(procedureName = "FIDE_UPDATE_TEMA_SP")
    void actualizarTema(
        @Param("V_ID_TEMA") Long idTema,
        @Param("V_NOMBRE") String nombre,
        @Param("V_DESCRIPCION") String descripcion,
        @Param("V_ID_ESTADO") Long idEstado
    );
}
