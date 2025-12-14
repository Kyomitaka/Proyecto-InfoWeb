package com.Kyomi.InfoWeb.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Kyomi.InfoWeb.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Procedure(procedureName = "FIDE_LOGIN_USUARIO_SP")
    Map<String, Object> ejecutarLogin(
        @Param("P_USERNAME") String username,
        @Param("P_CONTRASENA") String contrasena
    );

    @Procedure(procedureName = "FIDE_REGISTRO_USUARIO_SP")
    void registrarUsuario(
        @Param("P_NOMBRE") String nombre,
        @Param("P_APELLIDO") String apellido,
        @Param("P_CORREO") String correo,
        @Param("P_USERNAME") String username,
        @Param("P_CONTRASENA") String contrasena,
        @Param("P_ID_ROL") Long idRol,
        @Param("P_ID_ESTADO") Long idEstado
    );
}
