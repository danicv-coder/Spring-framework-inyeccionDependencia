package com.proyecto.springboot.app.springbootdi.app.models.service;

import org.springframework.stereotype.Component;

//@Component("PrimerServicio")
public class MiServicio implements IServicio {
    @Override
    public String operaciones() {
        return "Ejecuntado alguna operacion...";
    }
}
