package com.example.rencapp.repositories;

import com.example.rencapp.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    Notificacion findNotificacionById(Long id);
}
