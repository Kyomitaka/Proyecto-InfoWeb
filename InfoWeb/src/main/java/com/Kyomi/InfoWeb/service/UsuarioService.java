package com.Kyomi.InfoWeb.service;

import com.Kyomi.InfoWeb.dto.LoginDTO;
import com.Kyomi.InfoWeb.model.Usuario;

public interface UsuarioService {

    LoginDTO login(String username, String contrasena);

    void registrar(Usuario usuario);
}
