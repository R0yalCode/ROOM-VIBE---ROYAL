package edu.unl.cc.roomvibe.bussiness.services;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import edu.unl.cc.roomvibe.domain.common.Reserva;

import java.io.Serializable;

/**
 *author:
 * Steeven Pardo
 */

@ApplicationScoped
public class ReservaService implements Serializable {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Reserva reserva) {
        System.out.println("Guardando reserva: " + reserva);
        em.persist(reserva);
    }
/*
    @PostConstruct
    public void init() {
        System.out.println("✅ EntityManager inyectado: " + (em != null));
    }
*/
}
