package com.Kyomi.InfoWeb.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kyomi.InfoWeb.dto.LoginDTO;
import com.Kyomi.InfoWeb.model.Usuario;
import com.Kyomi.InfoWeb.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public LoginDTO login(String username, String contrasena) {

        Map<String, Object> result = usuarioRepository.ejecutarLogin(username, contrasena);

        String resultado = (String) result.get("P_RESULTADO_OUT");
        Long idUsuario = result.get("P_ID_USUARIO_OUT") != null
                ? ((Number) result.get("P_ID_USUARIO_OUT")).longValue()
                : null;

        Long idRol = result.get("P_ID_ROL_OUT") != null
                ? ((Number) result.get("P_ID_ROL_OUT")).longValue()
                : null;

        Long idEstado = result.get("P_ID_ESTADO_OUT") != null
                ? ((Number) result.get("P_ID_ESTADO_OUT")).longValue()
                : null;

        return new LoginDTO(resultado, idUsuario, idRol, idEstado);
    }

    @Override
    public void registrar(Usuario usuario) {

        usuarioRepository.registrarUsuario(
            usuario.getNombre(),
            usuario.getApellido(),
            usuario.getCorreo(),
            usuario.getUsername(),
            usuario.getContrasenaEncriptada(),  
            2L,  
            1L  
        );
    }
}
