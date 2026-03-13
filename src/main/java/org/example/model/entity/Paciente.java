package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pacientes")
public class Paciente extends Persona {

    private String grupoSanguineo;

    private boolean rh;

    @OneToMany(mappedBy = "paciente")
    private List<SignosVitales> signosVitales;

}
