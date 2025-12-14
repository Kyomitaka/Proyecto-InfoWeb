package com.Kyomi.InfoWeb.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.repository.CalificacionRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    @Override
    public void registrarCalificacion(Long idUsuario, Long idNoticia, Integer puntaje) {

        calificacionRepository.registrarCalificacion(
            idUsuario,
            idNoticia,
            puntaje
        );
    }

    @Override
    public Double obtenerPromedio(Long idNoticia) {

        BigDecimal promedio = calificacionRepository.obtenerPromedioCalificacion(idNoticia);

        return (promedio != null) ? promedio.doubleValue() : 0.0;
    }
}
