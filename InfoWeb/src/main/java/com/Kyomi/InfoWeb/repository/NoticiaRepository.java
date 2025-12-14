package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Noticia;

import java.util.Date;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

    @Procedure(procedureName = "FIDE_INSERT_NOTICIA_SP")
    void insertarNoticia(
        @Param("P_ID_TEMA") Long idTema,
        @Param("P_ID_SUBTEMA") Long idSubtema,
        @Param("P_AUTOR") String autor,
        @Param("P_TITULO") String titulo,
        @Param("P_CONTENIDO") String contenido,
        @Param("P_FECHA_PUBLICACION") Date fechaPublicacion,
        @Param("P_PORTADA") String portada,
        @Param("P_CONTADOR_VISITAS") Integer contadorVisitas,
        @Param("P_CONTADOR_ENVIOS") Integer contadorEnvios,
        @Param("P_PROMEDIO_CALIFICACION") Double promedioCalificacion,
        @Param("P_ID_ESTADO") Long idEstado
    );

    @Procedure(procedureName = "FIDE_UPDATE_NOTICIA_SP")
    void actualizarNoticia(
        @Param("P_ID_NOTICIA") Long idNoticia,
        @Param("P_ID_TEMA") Long idTema,
        @Param("P_ID_SUBTEMA") Long idSubtema,
        @Param("P_AUTOR") String autor,
        @Param("P_TITULO") String titulo,
        @Param("P_CONTENIDO") String contenido,
        @Param("P_FECHA_PUBLICACION") Date fechaPublicacion,
        @Param("P_PORTADA") String portada,
        @Param("P_CONTADOR_VISITAS") Integer contadorVisitas,
        @Param("P_CONTADOR_ENVIOS") Integer contadorEnvios,
        @Param("P_PROMEDIO_CALIFICACION") Double promedioCalificacion,
        @Param("P_ID_ESTADO") Long idEstado
    );
}
