package com.example.rencapp.api;

import com.example.rencapp.models.Notificacion;
import com.example.rencapp.services.NotificacionServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NotificacionRestController {

    @Autowired
    private NotificacionServicesImpl notificacionServicesImpl;

    @GetMapping("/notificacion")
    public Notificacion findNotificacionById(@RequestParam Long id) {
        Notificacion notificacionSeleccionada = notificacionServicesImpl.findById(id);
        System.out.println(notificacionSeleccionada.getModoNotificacion());
        return null;
    }
}
