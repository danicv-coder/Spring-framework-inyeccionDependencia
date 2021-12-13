package com.proyecto.springboot.app.springbootdi.app.controllers;

import com.proyecto.springboot.app.springbootdi.app.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

   @Autowired
   // @Qualifier("PrimerServicio")
    private IServicio servicio;

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("objeto", servicio.operaciones());
        return "index";
    }

    public IServicio getServicio() {
        return servicio;
    }

    //@Autowired
    //public void setServicio(IServicio servicio) {
     //   this.servicio = servicio;
   // }
}
