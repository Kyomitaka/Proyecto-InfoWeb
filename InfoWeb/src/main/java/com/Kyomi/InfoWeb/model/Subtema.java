package com.Kyomi.InfoWeb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FIDE_SUBTEMA_TB")
public class Subtema {

    @Id
    @Column(name = "ID_SUBTEMA")
    private Long idSubtema;

    @Column(name = "ID_TEMA")
    private Long idTema;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ID_ESTADO")
    private Long idEstado;

    public Subtema() {}

    public Long getIdSubtema() {
        return idSubtema;
    }

    public void setIdSubtema(Long idSubtema) {
        this.idSubtema = idSubtema;
    }

    public Long getIdTema() {
        return idTema;
    }

    public void setIdTema(Long idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}
