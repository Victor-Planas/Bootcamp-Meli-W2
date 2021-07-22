package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Turn;
import br.com.meli.odontology.odontology.services.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Turn")
public class TurnController {
    @Autowired
    TurnService turnService;

    @PostMapping("/add")
    public Turn addTurn(@RequestBody Turn Turn){
        return turnService.addTurn(Turn);
    }

    @GetMapping("/list")
    public List<Turn> getTurnList(){
        return turnService.listAllTurns();
    }

    @PutMapping("/update")
    public Turn updateTurn(@RequestBody Turn Turn){
        return turnService.updateTurn(Turn);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTurnById(@PathVariable Long id){
        turnService.deleteTurnById(id);
    }

    @GetMapping("/listAllFinishedTurn")
    public List<Turn> listAllTurnsFinishedStatus(){
        return turnService.listAllTurnsByStatus("Concluido");
    }

    @GetMapping("/listAllPendingTurn/{date}")
    public List<Turn> listAllTurnsPendingStatus(@PathVariable LocalDate date){
        return turnService.listAllTurnsByStatusByDate("Pendente", date);
    }

    @GetMapping("/listAllReescheduled")
    public List<Turn> listAllReescheduled(){
        return turnService.listAllTurnsByStatus("Reprogramado");
    }

    @GetMapping("/listAllReescheduledByDentist")
    public List<Turn> listAllReescheduledByDentist(@RequestBody Dentist dentist){
        return turnService.listAllTurnsByStatusByDentist(dentist);
    }

}
