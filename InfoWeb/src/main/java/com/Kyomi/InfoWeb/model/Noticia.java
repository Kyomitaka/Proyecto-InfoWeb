package com.Kyomi.InfoWeb.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FIDE_NOTICIA_TB")
public class Noticia {

    @Id
    @Column(name = "ID_NOTICIA")
    private Long idNoticia;

    @Column(name = "ID_TEMA")
    private Long idTema;

    @Column(name = "ID_SUBTEMA")
    private Long idSubtema;

    @Column(name = "AUTOR")
    private String autor;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "CONTENIDO")
    private String contenido;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_PUBLICACION")
    private Date fechaPublicacion;

    @Column(name = "PORTADA")
    private String portada;

    @Column(name = "CONTADOR_VISITAS")
    private Integer contadorVisitas;

    @Column(name = "CONTADOR_ENVIOS")
    private Integer contadorEnvios;

    @Column(name = "PROMEDIO_CALIFICACION")
    private Double promedioCalificacion;

    @Column(name = "ID_ESTADO")
    private Long idEstado;

    public Noticia() {}

    public Long getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Long idNoticia) {
        this.idNoticia = idNoticia;
    }

    public Long getIdTema() {
        return idTema;
    }

    public void setIdTema(Long idTema) {
        this.idTema = idTema;
    }

    public Long getIdSubtema() {
        return idSubtema;
    }

    public void setIdSubtema(Long idSubtema) {
        this.idSubtema = idSubtema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public Integer getContadorVisitas() {
        return contadorVisitas;
    }

    public void setContadorVisitas(Integer contadorVisitas) {
        this.contadorVisitas = contadorVisitas;
    }

    public Integer getContadorEnvios() {
        return contadorEnvios;
    }

    public void setContadorEnvios(Integer contadorEnvios) {
        this.contadorEnvios = contadorEnvios;
    }

    public Double getPromedioCalificacion() {
        return promedioCalificacion;
    }

    public void setPromedioCalificacion(Double promedioCalificacion) {
        this.promedioCalificacion = promedioCalificacion;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}
