package com.Kyomi.InfoWeb.service;

public interface CalificacionService {

    void registrarCalificacion(Long idUsuario, Long idNoticia, Integer puntaje);

    Double obtenerPromedio(Long idNoticia);
}
