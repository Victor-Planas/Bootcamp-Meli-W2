package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long idTurnStatus;
    private String name;
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "turnStatus")
    List<Turn> turns;
}
