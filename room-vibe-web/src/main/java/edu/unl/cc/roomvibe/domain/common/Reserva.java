package edu.unl.cc.roomvibe.domain.common;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Reservas")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @NotNull
    @NotEmpty
    @Email
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_entrada", nullable = false)
    private Date fechaEntrada;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_salida", nullable = false)
    private Date fechaSalida;

    @NotNull
    @NotEmpty
    @Column(name = "tipo_habitacion", nullable = false, length = 50)
    private String tipoHabitacion;

    @NotNull
    @Column(name = "personas", nullable = false)
    private Integer personas;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private Date fechaCreacion;

    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = new Date();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(Date fechaEntrada) { this.fechaEntrada = fechaEntrada; }

    public Date getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

    public String getTipoHabitacion() { return tipoHabitacion; }
    public void setTipoHabitacion(String tipoHabitacion) { this.tipoHabitacion = tipoHabitacion; }

    public Integer getPersonas() { return personas; }
    public void setPersonas(Integer personas) { this.personas = personas; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", personas=" + personas +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
