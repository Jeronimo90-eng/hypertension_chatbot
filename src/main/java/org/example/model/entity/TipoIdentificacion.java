package org.example.model.entity;

@Entity
@Table(name = "TIPOS_IDENTIFICACION")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

}
