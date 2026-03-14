package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PACIENTE")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Paciente extends Persona {



}
