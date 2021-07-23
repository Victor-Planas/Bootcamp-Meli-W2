package br.com.meli.odontology.odontology.controllers;
import br.com.meli.odontology.odontology.entities.Patient;
import br.com.meli.odontology.odontology.forms.PatientForm;
import br.com.meli.odontology.odontology.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody PatientForm patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("/list")
    public List<Patient> getPatientList(){
        return patientService.listAllPatients();
    }

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody PatientForm patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePatientById(@PathVariable Long id){
        patientService.deletePatient(id);
    }

    @GetMapping("/listPatientsByDay/{date}")
    public List<Patient> listAllPatientByDay(@PathVariable LocalDate date){
        return patientService.listAllPatientsByDate(date);
    }

    @PostMapping("/setTurns/{idPatient}")
    public Patient setTurns(@PathVariable Long idPatient, @RequestBody List<Long> turns){
        return patientService.setTurns(idPatient,turns);
    }

}
