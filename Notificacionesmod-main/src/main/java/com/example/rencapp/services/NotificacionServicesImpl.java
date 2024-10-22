package com.example.rencapp.services;
import com.example.rencapp.models.Notificacion;
import com.example.rencapp.repositories.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionServicesImpl {

    @Autowired
    private NotificacionRepository notificacionRepository;


    public Notificacion findById(Long id) {
        return notificacionRepository.getReferenceById(id);
    }
}
