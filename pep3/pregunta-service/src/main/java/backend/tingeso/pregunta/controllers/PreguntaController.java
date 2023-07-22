package backend.tingeso.pregunta.controllers;

import backend.tingeso.pregunta.entities.PreguntaEntity;
import backend.tingeso.pregunta.services.PreguntaService;
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

    @GetMapping
    public ResponseEntity<ArrayList<PreguntaEntity>> listadoProblemas(){
        ArrayList<PreguntaEntity> listaProblemas = preguntaService.obtenerData();
        if(listaProblemas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaProblemas);
    }
}
