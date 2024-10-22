package com.example.rencapp.services;

import com.example.rencapp.models.Notificacion;
import org.springframework.stereotype.Service;

@Service
public interface NotificacionService {

    Notificacion findById(Long id);
}
