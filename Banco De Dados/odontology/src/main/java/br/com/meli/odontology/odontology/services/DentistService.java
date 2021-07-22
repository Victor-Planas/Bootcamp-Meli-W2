package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService {
    @Autowired
    DentistRepository dentistRepository;

    public Dentist addDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    public List<Dentist> listAllDentists() {
        return dentistRepository.findAll();
    }

    public Dentist updateDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    public void deleteDentistById(Long id) {
        dentistRepository.deleteById(id);
    }
}
