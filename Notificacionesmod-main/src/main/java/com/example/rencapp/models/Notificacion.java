package com.example.rencapp.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "notificaciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Notificacion {

    public enum ModoNotificacion
    {
        WHATSAPP,        CORREO,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificacionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "modo_notificacion")
    private ModoNotificacion modoNotificacion;

    @Column(name = "notificacion_fecha")
    private LocalDateTime fechaNotificacion;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne // Relación muchos a uno con Solicitudes
    @JoinColumn(name = "solicitud_id") // Clave foránea que referencia a solicitudId en la tabla solicitudes
    private Solicitudes solicitudId;



}
