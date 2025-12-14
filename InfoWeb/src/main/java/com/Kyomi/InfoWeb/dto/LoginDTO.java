package com.Kyomi.InfoWeb.dto;

public class LoginDTO {

    private String username;
    private String contrasena;
    private String resultado; 
    private Long idUsuario;
    private Long idRol;
    private Long idEstado;

    public LoginDTO() {}

    public LoginDTO(String resultado, Long idUsuario, Long idRol, Long idEstado) {
        this.resultado = resultado;
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.idEstado = idEstado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}