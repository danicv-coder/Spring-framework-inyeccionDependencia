package com.proyecto.springboot.app.springbootdi.app;

import com.proyecto.springboot.app.springbootdi.app.models.domains.ItemFactura;
import com.proyecto.springboot.app.springbootdi.app.models.domains.Producto;
import com.proyecto.springboot.app.springbootdi.app.models.service.IServicio;
import com.proyecto.springboot.app.springbootdi.app.models.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("primerServicio")
    public IServicio registrarMiservicio() {
        return new MiServicio();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("telefono", 300);
        Producto producto2 = new Producto("camara", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);

        return Arrays.asList(linea1, linea2);
    }
}
