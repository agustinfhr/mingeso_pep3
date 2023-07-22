package backend.tingeso.pregunta.services;

import backend.tingeso.pregunta.entities.PreguntaEntity;
import backend.tingeso.pregunta.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;

    public ArrayList<PreguntaEntity> obtenerData(){
        return (ArrayList<PreguntaEntity>) preguntaRepository.findAll();
    }
}
