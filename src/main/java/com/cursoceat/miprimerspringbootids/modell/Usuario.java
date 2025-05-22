package com.cursoceat.miprimerspringbootids.modell;

public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String ciudad;
    private String provincia;
    private String cp;

    public Usuario(String nombre, String apellido, String usuario, String ciudad, String provincia, String cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", usuario='" + usuario + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}

