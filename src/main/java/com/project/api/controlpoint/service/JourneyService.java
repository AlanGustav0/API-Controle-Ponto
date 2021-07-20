package com.project.api.controlpoint.service;

import com.project.api.controlpoint.model.WorkJourney;
import com.project.api.controlpoint.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    //Método responsável por salvar o objeto
    public WorkJourney saveJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }
    //Método responsável por obter o objeto
   public Optional<WorkJourney> getJourneyById(Long idJourney){
        return journeyRepository.findById(idJourney);
   }

    //Método responsável por atualizar o objeto
    public WorkJourney updateJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }
    //Método responsável por deletar o objeto
    public void deleteJourneyById(Long idJourney){
        journeyRepository.deleteById(idJourney);
    }

    //Método responsável por obter todos os objetos
    public List<WorkJourney> findAll(){
        return journeyRepository.findAll();
    }
}
