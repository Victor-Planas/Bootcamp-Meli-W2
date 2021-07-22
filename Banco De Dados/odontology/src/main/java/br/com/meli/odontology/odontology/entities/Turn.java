package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "turns")
public class Turn {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long IdTurn;
    private LocalDate day;
    @ManyToOne
    @JoinColumn(name = "id_diary", nullable = false)
    @JsonIgnore
    private Diary diary;
    @ManyToOne
    @JoinColumn(name = "id_turn_status", nullable = false)
    @JsonIgnore
    private TurnStatus turnStatus;
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    @JsonIgnore
    private Patient patient;

}
