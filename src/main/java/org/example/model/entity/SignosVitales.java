package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "signos_vitales")
public class SignosVitales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "presion_sistolica")
    private String presionSistolica;

    @Column(name = "presion_diastolica")
    private String presionDiastolica;

    @Column(name = "frecuencia_cardiaca")
    private String frecuenciaCardiaca;

    private String temperatura;

    @Column(name = "saturacion_oxigeno")
    private String saturacionOxigeno;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

}