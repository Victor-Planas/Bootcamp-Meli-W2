package br.com.meli.odontology.odontology.repositories;

import br.com.meli.odontology.odontology.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
