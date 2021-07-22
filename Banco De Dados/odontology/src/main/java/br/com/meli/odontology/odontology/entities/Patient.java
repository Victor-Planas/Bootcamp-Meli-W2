package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long idPatient;
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private LocalDate birthDate;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Turn> turns;

}
