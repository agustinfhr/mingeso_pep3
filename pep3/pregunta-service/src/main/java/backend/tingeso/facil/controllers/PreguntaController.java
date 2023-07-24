package backend.tingeso.facil.controllers;

import backend.tingeso.facil.entities.PreguntaEntity;
import backend.tingeso.facil.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
    @Autowired
    PreguntaService preguntaService;

    @GetMapping("/basico")
    public ResponseEntity<ArrayList<PreguntaEntity>> listadoProblemasBasico(){
        ArrayList<PreguntaEntity> listaProblemas = preguntaService.obtenerPreguntaBasico();
        if(listaProblemas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaProblemas);
    }

    @GetMapping("/intermedio")
    public ResponseEntity<ArrayList<PreguntaEntity>> listadoProblemasIntermedio(){
        ArrayList<PreguntaEntity> listaProblemas = preguntaService.obtenerPreguntaIntermedio();
        if(listaProblemas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaProblemas);
    }

    @GetMapping("/avanzado")
    public ResponseEntity<ArrayList<PreguntaEntity>> listadoProblemasAvanzado(){
        ArrayList<PreguntaEntity> listaProblemas = preguntaService.obtenerPreguntaAvanzado();
        if(listaProblemas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaProblemas);
    }
}
