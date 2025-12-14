package com.Kyomi.InfoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.model.Subtema;
import com.Kyomi.InfoWeb.repository.SubtemaRepository;

@Service
public class SubtemaServiceImpl implements SubtemaService {

    @Autowired
    private SubtemaRepository subtemaRepository;

    @Override
    public void insertarSubtema(Subtema subtema) {

        subtemaRepository.insertarSubtema(
            subtema.getIdTema(),
            subtema.getNombre(),
            subtema.getDescripcion(),
            subtema.getIdEstado()
        );
    }

    @Override
    public void actualizarSubtema(Subtema subtema) {

        subtemaRepository.actualizarSubtema(
            subtema.getIdSubtema(),
            subtema.getIdTema(),
            subtema.getNombre(),
            subtema.getDescripcion(),
            subtema.getIdEstado()
        );
    }
}
