package com.Kyomi.InfoWeb.service;

import java.util.List;

import com.Kyomi.InfoWeb.model.Noticia;

public interface NoticiaService {

    void insertarNoticia(Noticia noticia);

    void actualizarNoticia(Noticia noticia);

    List<Noticia> consultarNoticias(
        Long idTema,
        Long idSubtema,
        String autor
    );

    Integer buscarNoticias(String texto);
}
