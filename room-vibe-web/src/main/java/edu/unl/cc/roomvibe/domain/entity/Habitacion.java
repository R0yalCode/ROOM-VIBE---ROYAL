package edu.unl.cc.roomvibe.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String imagen;
    private String precio;
    private String descripcion;
    private String clase;

    // Constructor vacío requerido por JPA
    public Habitacion() {}

    public Habitacion(String nombre, String imagen, String precio, String descripcion, String clase) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.descripcion = descripcion;
        this.clase = clase;
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }
}