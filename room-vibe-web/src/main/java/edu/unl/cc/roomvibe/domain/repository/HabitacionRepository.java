package edu.unl.cc.roomvibe.domain.repository;

import edu.unl.cc.roomvibe.domain.entity.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {
}