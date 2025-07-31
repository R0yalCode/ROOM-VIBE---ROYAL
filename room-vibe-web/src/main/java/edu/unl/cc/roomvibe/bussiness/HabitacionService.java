package edu.unl.cc.roomvibe.bussines;

import edu.unl.cc.roomvibe.domain.entity.Habitacion;
import edu.unl.cc.roomvibe.domain.repository.HabitacionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabitacionService {
    private final HabitacionRepository habitacionRepository;

    public HabitacionService(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }

    public List<Habitacion> obtenerTodas() {
        return habitacionRepository.findAll();
    }
}