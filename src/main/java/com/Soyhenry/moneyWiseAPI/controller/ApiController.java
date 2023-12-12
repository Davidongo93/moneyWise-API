package com.Soyhenry.moneyWiseAPI.controller;
import java.util.ArrayList;
import java.util.List;

import com.Soyhenry.moneyWiseAPI.model.Elemento;
import com.Soyhenry.moneyWiseAPI.service.ElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final ElementoService elementoService;

    @Autowired

    public ApiController(ElementoService elementoService) {

        this.elementoService = elementoService;

    }
    @PostMapping("/create")

    public ResponseEntity<Elemento> crearElemento(@RequestBody Elemento elemento) {
        System.out.println("crear");
        // Lógica para crear el elemento
        return ResponseEntity.ok(elementoService.crearElemento(elemento));

    }



    @GetMapping("/users")

    public ResponseEntity<List<Elemento>> obtenerElementos() {

        // Lógica para obtener elementos

        return ResponseEntity.ok(elementoService.obtenerElementos());
    }
}
