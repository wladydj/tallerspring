package com.prjvsp.prjvsptaller.domain.dto;

import io.swagger.annotations.ApiModelProperty;

public class Office {
    @ApiModelProperty(notes = "Identificador de la Oficina de atención al ciudadano")
    private Integer oficinaId;
    @ApiModelProperty(notes = "Nombre de la Oficina de atención al ciudadano")
    private String nombreId;
    @ApiModelProperty("Gestor de la Oficina de atención al ciudadano")
    private String gestorId;
    @ApiModelProperty(notes = "Email del gestor de la Oficina de atención al ciudadano")
    private String emailId;
    @ApiModelProperty(notes = "Dirección de la Oficina de atención al ciudadano")
    private String direccionId;
    @ApiModelProperty(notes = "Ciudad de la Oficina de atención al ciudadano")
    private String ciudadId;
    @ApiModelProperty(notes = "Dpto de la Oficina de atención al ciudadano")
    private String departamentoId;

    public Integer getOficinaId() {
        return oficinaId;
    }

    public void setOficinaId(Integer oficinaId) {
        this.oficinaId = oficinaId;
    }

    public String getNombreId() {
        return nombreId;
    }

    public void setNombreId(String nombreId) {
        this.nombreId = nombreId;
    }

    public String getGestorId() {
        return gestorId;
    }

    public void setGestorId(String gestorId) {
        this.gestorId = gestorId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(String direccionId) {
        this.direccionId = direccionId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
