package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Noticia;

public interface CorreoRepository extends JpaRepository<Noticia, Long> {

    @Procedure(procedureName = "FIDE_REGISTRAR_CORREO_ENVIADO_SP")
    void registrarCorreoEnviado(
        @Param("P_ID_NOTICIA") Long idNoticia
    );
}
