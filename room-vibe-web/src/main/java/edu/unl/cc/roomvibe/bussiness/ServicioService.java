package edu.unl.cc.roomvibe.bussiness;

import edu.unl.cc.roomvibe.domain.entity.Servicio;
import java.util.List;
import java.util.ArrayList;

public class ServicioService {
    public List<Servicio> listarServicios() {
        // Simulación: deberías obtener los datos de la base de datos
        List<Servicio> servicios = new ArrayList<>();
        servicios.add(new Servicio() {{
            setId(1L);
            setNombre("WiFi");
            setDescripcion("Internet inalámbrico de alta velocidad.");
            setImagen("images/servicios/wifi.jpg");
        }});
        servicios.add(new Servicio() {{
            setId(2L);
            setNombre("Desayuno");
            setDescripcion("Desayuno buffet incluido.");
            setImagen("images/servicios/desayuno.jpg");
        }});
        return servicios;
    }
}