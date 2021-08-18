package com.prjvsp.prjvsptaller.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oficina", schema = "taller")
public class Oficina {
    @Id
    @Column(name = "codigo_oficina")
    private Integer idOficina;
    @Column(name = "nombre_unidad_armda_nacional")
    private String nameOficina;
    @Column(name = "nombre_gestor")
    private String managerOficina;
    @Column(name = "email_gestor")
    private String emailOficina;
    @Column(name = "direccion_unidad")
    private String addressOficina;
    @Column(name = "ciudad")
    private String cityOficina;
    @Column(name = "departamento")
    private String dptOficina;

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public String getNameOficina() {
        return nameOficina;
    }

    public void setNameOficina(String nameOficina) {
        this.nameOficina = nameOficina;
    }

    public String getManagerOficina() {
        return managerOficina;
    }

    public void setManagerOficina(String managerOficina) {
        this.managerOficina = managerOficina;
    }

    public String getEmailOficina() {
        return emailOficina;
    }

    public void setEmailOficina(String emailOficina) {
        this.emailOficina = emailOficina;
    }

    public String getAddressOficina() {
        return addressOficina;
    }

    public void setAddressOficina(String addressOficina) {
        this.addressOficina = addressOficina;
    }

    public String getCityOficina() {
        return cityOficina;
    }

    public void setCityOficina(String cityOficina) {
        this.cityOficina = cityOficina;
    }

    public String getDptOficina() {
        return dptOficina;
    }

    public void setDptOficina(String dptOficina) {
        this.dptOficina = dptOficina;
    }
}
