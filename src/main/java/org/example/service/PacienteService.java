package org.example.service;

import org.example.model.entity.Paciente;
import org.springframework.stereotype.Service;
import org.example.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente crearPaciente(Paciente paciente) {
        return repository.save(paciente);
    }
}
