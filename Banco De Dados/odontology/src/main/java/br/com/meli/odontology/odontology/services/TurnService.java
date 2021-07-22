package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Turn;
import br.com.meli.odontology.odontology.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TurnService {
    @Autowired
    TurnRepository turnRepository;

    public Turn addTurn(Turn Turn) {
        return turnRepository.save(Turn);
    }

    public List<Turn> listAllTurns() {
        return turnRepository.findAll();
    }

    public Turn updateTurn(Turn Turn) {
        return turnRepository.save(Turn);
    }

    public void deleteTurnById(Long id) {
        turnRepository.deleteById(id);
    }

    public List<Turn> listAllTurnsByStatus(String status) {
        return turnRepository.listAllTurnsByStatus(status);
    }
    public List<Turn> listAllTurnsByStatusByDate(String status, LocalDate date) {
        return turnRepository.listAllTurnsByStatusByDate(status, date);
    }

    public List<Turn> listAllTurnsByStatusByDentist(Dentist dentist) {
        return turnRepository.listAllReescheduledByDentist(dentist);
    }
}
