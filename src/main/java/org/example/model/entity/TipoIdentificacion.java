package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;

@Getter
@Entity
@Table(name = "TIPO_IDENTIFICACION")
public class TipoIdentificacion extends BaseEntity{

    private String codigo;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

}
