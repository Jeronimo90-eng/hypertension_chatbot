package org.example.mapper;

import org.example.dto.PacienteDTO;
import org.example.model.entity.Paciente;

public class PacienteMapper {

    public static PacienteDTO toDTO(Paciente paciente) {
        PacienteDTO dto = new PacienteDTO();
        dto.setNombre(paciente.getNombre());
        return dto;
    }

}