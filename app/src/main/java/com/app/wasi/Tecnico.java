package com.app.wasi;

public class Tecnico {
    private Integer id;
    private String nombres;
    private String distrito;
    private Float valoracion;
    private Integer numeroComentarios;
    private String urlFoto;

    public Tecnico(Integer id, String nombres, String distrito, Float valoracion, Integer numeroComentarios, String urlFoto) {
        this.id = id;
        this.nombres = nombres;
        this.distrito = distrito;
        this.valoracion = valoracion;
        this.numeroComentarios = numeroComentarios;
        this.urlFoto = urlFoto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getNumeroComentarios() {
        return numeroComentarios;
    }

    public void setNumeroComentarios(Integer numeroComentarios) {
        this.numeroComentarios = numeroComentarios;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
