package com.Kyomi.InfoWeb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FIDE_CALIFICACION_TB")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCalificacion;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_NOTICIA")
    private Long idNoticia;

    @Column(name = "PUNTAJE")
    private Integer puntaje;

    public Calificacion() {}

    public Long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Long idNoticia) {
        this.idNoticia = idNoticia;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
