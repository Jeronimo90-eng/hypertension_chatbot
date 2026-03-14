package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "SIGNO_VITAL")
public class SignoVital extends BaseEntity {

    @Column(name = "presion_sistolica")
    private Integer presionSistolica;

    @Column(name = "presion_diastolica")
    private Integer presionDiastolica;

    @Column(name = "frecuencia_cardiaca")
    private Integer frecuenciaCardiaca;

    @Column(precision = 4, scale = 2)
    private BigDecimal temperatura;

    @Column(name = "saturacion_oxigeno")
    private Integer saturacionOxigeno;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @OneToMany(mappedBy = "signoVital", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Observacion> observaciones = new ArrayList<>();

}