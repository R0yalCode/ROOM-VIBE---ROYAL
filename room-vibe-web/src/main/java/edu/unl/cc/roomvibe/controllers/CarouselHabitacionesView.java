package edu.unl.cc.roomvibe.controllers;

import edu.unl.cc.roomvibe.bussines.HabitacionService;
import edu.unl.cc.roomvibe.domain.entity.Habitacion;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CarouselHabitacionesView implements Serializable {
    @Inject
    private HabitacionService habitacionService;

    private List<Habitacion> habitaciones;

    public CarouselHabitacionesView() {
        // Constructor sin parámetros requerido por CDI
    }

    @PostConstruct
    public void init() {
        habitaciones = habitacionService.obtenerTodas();
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
}