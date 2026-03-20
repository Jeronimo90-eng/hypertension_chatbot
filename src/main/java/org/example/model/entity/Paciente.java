package org.example.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PACIENTE")
@PrimaryKeyJoinColumn(name = "persona_id")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paciente extends Persona {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Medico medico;

    @JsonProperty("medicoId")
    public Long getMedicoId() {
        return medico != null ? medico.getId() : null;
    }

}
