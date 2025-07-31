package edu.unl.cc.roomvibe.faces;

import edu.unl.cc.roomvibe.bussiness.services.ReservaService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.Date;
import edu.unl.cc.roomvibe.domain.common.Reserva;

@Named
@ViewScoped
public class ReservaBean implements Serializable {

    @Inject
    private ReservaService reservaService;

    private String nombre;
    private String email;
    private Date fechaEntrada;
    private Date fechaSalida;
    private String habitacion;
    private Integer personas;

    public void reservar() {
        try {
            // Validación de fechas
            if (fechaEntrada != null && fechaSalida != null && fechaSalida.before(fechaEntrada)) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                                "Fechas inválidas",
                                "La fecha de salida debe ser posterior a la de entrada."));
                return;
            }

            Reserva reserva = new Reserva();
            reserva.setNombre(nombre);
            reserva.setEmail(email);
            reserva.setFechaEntrada(fechaEntrada);
            reserva.setFechaSalida(fechaSalida);
            reserva.setTipoHabitacion(habitacion);
            reserva.setPersonas(personas);

            reservaService.save(reserva);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Reserva registrada",
                            "¡Gracias por reservar!"));

            System.out.println("Reserva creada: " + reserva);

            // Limpiar campos del formulario
            nombre = null;
            email = null;
            fechaEntrada = null;
            fechaSalida = null;
            habitacion = null;
            personas = null;

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Error al guardar",
                            e.getMessage()));
            e.printStackTrace();
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(Date fechaEntrada) { this.fechaEntrada = fechaEntrada; }

    public Date getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

    public String getHabitacion() { return habitacion; }
    public void setHabitacion(String habitacion) { this.habitacion = habitacion; }

    public Integer getPersonas() { return personas; }
    public void setPersonas(Integer personas) { this.personas = personas; }
}
