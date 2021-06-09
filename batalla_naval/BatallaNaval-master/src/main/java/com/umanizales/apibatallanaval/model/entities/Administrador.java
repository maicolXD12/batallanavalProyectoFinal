package com.umanizales.apibatallanaval.model.entities;

import javax.persistence.*;

@Entity

public class Administrador
{
        private int id;
        private String correo;
        private String contrasenia;
        private TipoAdministrador tipoAdministrador;

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Basic
        @Column(name = "correo", nullable = false, length = 70)
        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        @Basic
        @Column(name = "contrasenia", nullable = false, length = 10)
        public String getContrasenia() {
            return contrasenia;
        }

        public void setContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrador administrador = (Administrador) o;

        if (id != administrador.id) return false;
        if (correo != null ? !correo.equals(administrador.correo) : administrador.correo != null) return false;
        if (contrasenia != null ? !contrasenia.equals(administrador.contrasenia) : administrador.contrasenia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        result = 31 * result + (contrasenia != null ? contrasenia.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "tipo_administrador", referencedColumnName = "correo", nullable = false)

    public TipoAdministrador getTipoAdministrador() {
        return tipoAdministrador;
    }

    public void setTipoAdministrador(TipoAdministrador tipoAdministrador) {
        this.tipoAdministrador = tipoAdministrador;
    }
}
