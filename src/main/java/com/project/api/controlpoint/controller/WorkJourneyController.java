package com.project.api.controlpoint.controller;

import com.project.api.controlpoint.model.WorkJourney;
import com.project.api.controlpoint.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

//Define para o Spring que trata-se de uma classe de controle e seus retornos serão como Json
@RestController
//Notação para definir o endpoint
@RequestMapping("/journey")
public class WorkJourneyController {

    @Autowired
    JourneyService journeyService;

    //Cria os objetos
    @PostMapping
    public WorkJourney createJourney(@RequestBody WorkJourney workJourney){
        return journeyService.saveJourney(workJourney);
    }

    //Criamos o método para obter a jornada através do Id e retornamos um ResponseEntity, ou seja, irá retornar o código Http de sucesso (200), caso seja encontrado.
    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkJourney> getJourneyById(@PathVariable("idJourney")  Long idJourney) throws Exception {
        return ResponseEntity.ok(journeyService.getJourneyById(idJourney).orElseThrow(() -> new NoSuchElementException("Journey not found")));

    }
    //Atualiza o objeto
    @PutMapping
    public WorkJourney updateJourney(@RequestBody WorkJourney workJourney){
        return journeyService.updateJourney(workJourney);
    }

    //Deleta o objeto através do Id
    @DeleteMapping("/{idJourney}")
    public ResponseEntity deleteJourneyById(@PathVariable("idJourney") Long idJourney) throws Exception {
        try{
            journeyService.deleteJourneyById(idJourney);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkJourney>) ResponseEntity.ok();
    }


    //Lista todos os objetos
    @GetMapping
    public List<WorkJourney> findAll(){
        return journeyService.findAll();
    }


}
