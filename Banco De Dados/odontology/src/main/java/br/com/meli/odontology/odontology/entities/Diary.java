package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "diarys")
public class Diary {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long idDiary;
    private LocalTime startTime;
    private LocalTime endingTime;
    @ManyToOne
    @JoinColumn(name="id_dentist", nullable=false)
    @JsonIgnore
    private Dentist dentist;
    @OneToMany(mappedBy = "diary")
    @JsonIgnore
    private List<Turn> turns;
}
