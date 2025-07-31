package edu.unl.cc.roomvibe.faces;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.Arrays;
import java.util.List;

@Named
@RequestScoped
public class InicioBean {

    public List<Testimonio> getTestimonios() {
        return Arrays.asList(
                new Testimonio("Steeven Pardo", "10/07/2025", "Todo impecable, volvería sin dudar."),
                new Testimonio("Juan Calopino", "09/07/2025", "Atención excelente, habitaciones cómodas."),
                new Testimonio("Royel Jima", "08/07/2025", "El restaurante fue una joya."),
                new Testimonio("Daniel Savedra", "05/07/2025","Una vista impecable nos ofrece el hotel")
        );
    }

    public static class Testimonio {
        private String nombre;
        private String fecha;
        private String comentario;

        public Testimonio(String nombre, String fecha, String comentario) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.comentario = comentario;
        }

        public String getNombre() { return nombre; }
        public String getFecha() { return fecha; }
        public String getComentario() { return comentario; }
    }
}
