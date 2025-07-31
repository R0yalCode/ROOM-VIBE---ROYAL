// src/main/java/edu/unl/cc/jbrew/controllers/CarouselGaleriaView.java
package edu.unl.cc.roomvibe.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.primefaces.model.ResponsiveOption;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class CarouselGaleriaView implements Serializable {

    private List<ImagenGaleria> imagenes;
    private List<ResponsiveOption> responsiveOptions;

    @PostConstruct
    public void init() {
        imagenes = List.of(
                new ImagenGaleria("images/inicio.jpg", "Los mejores en lo mejor"),
                new ImagenGaleria("images/inicio1.jpg", "Vista panorámica del hotel"),
                new ImagenGaleria("images/inicio2.jpg", "Nuestro mejor cliente")
        );

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1024px", 3, 3));
        responsiveOptions.add(new ResponsiveOption("768px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("560px", 1, 1));
    }

    public List<ImagenGaleria> getImagenes() {
        return imagenes;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public static class ImagenGaleria {
        private String url;
        private String descripcion;

        public ImagenGaleria(String url, String descripcion) {
            this.url = url;
            this.descripcion = descripcion;
        }

        public String getUrl() { return url; }
        public String getDescripcion() { return descripcion; }
    }
}