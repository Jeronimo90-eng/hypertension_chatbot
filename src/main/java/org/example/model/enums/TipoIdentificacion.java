package org.example.model.enums;

public enum TipoIdentificacion {

    CC("Cédula de Ciudadanía"),
    CE("Cédula de Extranjería"),
    PASSPORT("Pasaporte"),
    NIT("Número de Identificación Tributaria");

    private final String description;

    TipoIdentificacion(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}