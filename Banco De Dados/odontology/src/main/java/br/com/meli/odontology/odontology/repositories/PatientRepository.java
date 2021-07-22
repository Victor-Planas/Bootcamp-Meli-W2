package br.com.meli.odontology.odontology.repositories;

import br.com.meli.odontology.odontology.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
