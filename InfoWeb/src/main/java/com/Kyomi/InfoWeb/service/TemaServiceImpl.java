package com.Kyomi.InfoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.model.Tema;
import com.Kyomi.InfoWeb.repository.TemaRepository;

@Service
public class TemaServiceImpl implements TemaService {

    @Autowired
    private TemaRepository temaRepository;

    @Override
    public void registrarTema(Tema tema) {

        temaRepository.insertarTema(
            tema.getNombre(),
            tema.getDescripcion(),
            tema.getIdEstado()
        );
    }

    @Override
    public void actualizarTema(Tema tema) {
        temaRepository.actualizarTema(
            tema.getIdTema(),
            tema.getNombre(),
            tema.getDescripcion(),
            tema.getIdEstado()
        );
    }
}
