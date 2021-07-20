package com.project.api.controlpoint.repository;

import com.project.api.controlpoint.model.WorkJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Realiza a persistência dos dados e já possui todos os métodos do Crud
@Repository
public interface JourneyRepository extends JpaRepository<WorkJourney,Long> {
}
