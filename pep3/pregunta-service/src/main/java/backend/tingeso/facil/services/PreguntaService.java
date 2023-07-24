package backend.tingeso.facil.services;

import backend.tingeso.facil.entities.PreguntaEntity;
import backend.tingeso.facil.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;

    public ArrayList<PreguntaEntity> obtenerPreguntaBasico(){

        ArrayList<PreguntaEntity> preguntas = preguntaRepository.findPreguntasByNivel("basico");
        Collections.shuffle(preguntas);
        List<PreguntaEntity> subList = preguntas.subList(0, Math.min(preguntas.size(), 4));
        ArrayList<PreguntaEntity> preguntasAleatorias = new ArrayList<>(subList);
        return preguntasAleatorias;

    }

    public ArrayList<PreguntaEntity> obtenerPreguntaIntermedio(){

        List<PreguntaEntity> preguntas = preguntaRepository.findPreguntasByNivel("intermedio");
        Collections.shuffle(preguntas);
        List<PreguntaEntity> subList = preguntas.subList(0, Math.min(preguntas.size(), 4));
        ArrayList<PreguntaEntity> preguntasAleatorias = new ArrayList<>(subList);
        return preguntasAleatorias;

    }

    public ArrayList<PreguntaEntity> obtenerPreguntaAvanzado(){

        List<PreguntaEntity> preguntas = preguntaRepository.findPreguntasByNivel("avanzado");
        Collections.shuffle(preguntas);
        List<PreguntaEntity> subList = preguntas.subList(0, Math.min(preguntas.size(), 4));
        ArrayList<PreguntaEntity> preguntasAleatorias = new ArrayList<>(subList);
        return preguntasAleatorias;

    }
}
