package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name="dentists")
public class Dentist {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long idDentist;

    private String name;
    private String lastName;
    private String address;
    private String dni;
    private LocalDate birthDate;
    private String phone;
    private String email;
    private String codeMp;
    @OneToMany(mappedBy="dentist")
    @JsonIgnore
    private List<Diary> diaries;



}
