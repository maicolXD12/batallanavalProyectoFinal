package com.umanizales.apibatallanaval.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipo_administrador", schema = "public", catalog = "batalla_naval")

public class TipoAdministrador
{
    private String correo;
    private String rol;

    @Id
    @Column(name = "correo", nullable = false)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo= correo;
    }

    @Basic
    @Column(name = "rol", nullable = false, length = 50)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol= rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoAdministrador that = (TipoAdministrador) o;

        if (correo != that.correo) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;

        return true;
    }

}
