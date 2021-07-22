package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Patient;
import br.com.meli.odontology.odontology.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> listAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }

    public List<Patient> listAllPatientsByDate(LocalDate date){
        return patientRepository.findAllByDate(date);
    }
}
