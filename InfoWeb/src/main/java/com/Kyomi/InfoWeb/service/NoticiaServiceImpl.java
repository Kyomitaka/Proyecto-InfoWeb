package com.Kyomi.InfoWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.model.Noticia;
import com.Kyomi.InfoWeb.repository.NoticiaBusquedaRepository;
import com.Kyomi.InfoWeb.repository.NoticiaConsultaRepository;
import com.Kyomi.InfoWeb.repository.NoticiaRepository;

@Service
public class NoticiaServiceImpl implements NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Autowired
    private NoticiaConsultaRepository noticiaConsultaRepository; 

    @Autowired
    private NoticiaBusquedaRepository noticiaBusquedaRepository;

    @Override
    public void insertarNoticia(Noticia noticia) {

        noticiaRepository.insertarNoticia(
            noticia.getIdTema(),
            noticia.getIdSubtema(),
            noticia.getAutor(),
            noticia.getTitulo(),
            noticia.getContenido(),
            noticia.getFechaPublicacion(),
            noticia.getPortada(),
            noticia.getContadorVisitas(),
            noticia.getContadorEnvios(),
            noticia.getPromedioCalificacion(),
            noticia.getIdEstado()
        );
    }

    @Override
    public void actualizarNoticia(Noticia noticia) {

        noticiaRepository.actualizarNoticia(
            noticia.getIdNoticia(),
            noticia.getIdTema(),
            noticia.getIdSubtema(),
            noticia.getAutor(),
            noticia.getTitulo(),
            noticia.getContenido(),
            noticia.getFechaPublicacion(),
            noticia.getPortada(),
            noticia.getContadorVisitas(),
            noticia.getContadorEnvios(),
            noticia.getPromedioCalificacion(),
            noticia.getIdEstado()
        );
    }

    @Override
    public List<Noticia> consultarNoticias(
            Long idTema,
            Long idSubtema,
            String autor) {

        return noticiaConsultaRepository.consultarNoticias(
            idTema, idSubtema, autor
        );
    }

    @Override
    public Integer buscarNoticias(String texto) {
        return noticiaBusquedaRepository.contarNoticiasPorTexto(texto);
    }
}
