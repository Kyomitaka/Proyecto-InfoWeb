package com.Kyomi.InfoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.repository.CorreoRepository;

@Service
public class CorreoServiceImpl implements CorreoService {

    @Autowired
    private CorreoRepository noticiaCorreoRepository;

    @Override
    public void registrarEnvioCorreo(Long idNoticia) {
        noticiaCorreoRepository.registrarCorreoEnviado(idNoticia);
    }
}
