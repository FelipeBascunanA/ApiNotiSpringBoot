package com.example.rencapp.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "solicitudes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Solicitudes {
    public Solicitudes(long l, String maríaTorres, String solicitudDeLimpieza, Departamento departamento, String mail, String s, boolean b) {
    }

    public enum Departamento {        ASEO,              VETERINARIA    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitudId;

    @Column(name = "nombre_usuario", nullable = false, length = 100)
    private String nombreUsuario;

    @Column(name = "tipo_notificacion")
    private String tipoNotificacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "departamento")
    private Departamento departamento;

    @Column(name = "correo")
    private String correoUsuario;

    @Column(name = "telefono_usuario")
    private String telefonoUsuario;

    @Column(name = "notificacion")
    private boolean notificacion;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
