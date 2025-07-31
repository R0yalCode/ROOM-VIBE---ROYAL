package edu.unl.cc.roomvibe.controllers;

import edu.unl.cc.roomvibe.bussiness.ServicioService;
import edu.unl.cc.roomvibe.domain.entity.Servicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CarouselServiciosView implements Serializable {
    private List<Servicio> servicios;
    private ServicioService servicioService = new ServicioService();

    @PostConstruct
    public void init() {
        servicios = servicioService.listarServicios();
    }

    public List<Servicio> getServicios() {
        return servicios;
    }
}