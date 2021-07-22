package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.responses.DentistSchedule;
import br.com.meli.odontology.odontology.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController {
    @Autowired
    DentistService dentistService;

    @PostMapping("/add")
    public Dentist addDentist(@RequestBody Dentist dentist){
        return dentistService.addDentist(dentist);
    }

    @GetMapping("/list")
    public List<Dentist> getDentistList(){
        return dentistService.listAllDentists();
    }

    @PutMapping("/update")
    public Dentist updateDentist(@RequestBody Dentist dentist){
        return dentistService.updateDentist(dentist);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDentistById(@PathVariable Long id){
        dentistService.deleteDentistById(id);
    }

    @GetMapping("/list2turnDentistsByDate/{date}")
    public List<Dentist> listDentistsTwoTurnsSameDay(@PathVariable LocalDate date){
        return dentistService.listDentistsMoreThanTwoTurnsByDate(date);
    }

    @GetMapping("/listAllAppointments")
    public List<DentistSchedule> listAllAppointments(@RequestBody Dentist dentist){
        return dentistService.listAllAppointments(dentist);
    }
}
