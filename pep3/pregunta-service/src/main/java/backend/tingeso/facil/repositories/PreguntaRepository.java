package backend.tingeso.facil.repositories;

import backend.tingeso.facil.entities.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity, Integer> {

    @Query("select e from PreguntaEntity e where e.nivel = :nivel")
    ArrayList<PreguntaEntity> findPreguntasByNivel(String nivel);




}
