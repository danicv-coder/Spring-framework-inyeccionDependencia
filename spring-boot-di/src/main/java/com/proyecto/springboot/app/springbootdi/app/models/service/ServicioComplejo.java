package com.proyecto.springboot.app.springbootdi.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class ServicioComplejo implements IServicio {
    @Override
    public String operaciones() {
        return "Ejecutando algun proceso importante";
    }
}
