package com.example.rencapp.controllers;

import com.example.rencapp.models.Solicitudes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SolicitudesController {

    public List<Solicitudes> solicitudes = new ArrayList<>(Arrays.asList(
            new Solicitudes (1L,"María Torres", "Solicitud de limpieza", Solicitudes.Departamento.ASEO, "maria.torres@gmail.com", "+56 9 98765432", false),
            new Solicitudes(2L, "Pedro Sánchez", "Reclamo de ornato", Solicitudes.Departamento.ASEO, "pedro.sanchez@gmail.com'", "+56 9 91234567", true),
            new Solicitudes(3L, "Laura Díaz", "Solicitud de atención veterinaria", Solicitudes.Departamento.VETERINARIA, "laura.diaz@gmail.com", "+56 9 92345678", false)
    ));



}
