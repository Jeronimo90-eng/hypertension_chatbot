package org.example.model.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.example.model.enums.TipoIdentificacion;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@MappedSuperclass
public abstract class Persona extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    @Enumerated(EnumType.STRING)
    private TipoIdentificacion tipoIdentificacion;

    private String numeroIdentificacion;

    private String telefono;

    private String email;

    private String direccion;

    private String fechaNacimiento;

    private String sexo;

}
