package com.example.demo;

import jakarta.persistence.*;

// Definición de tabla
@Entity
@Table(name = "sucursal")
public class Sucursal {
    // Definición de columnas
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    // Print
    @Override
    public String toString() {
        return "Sucursal{" + "id=" + id
                + ", nombre=" + nombre
                + ", descripcion="
                + descripcion + '}';
    }
}
