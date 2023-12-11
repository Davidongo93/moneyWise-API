package com.Soyhenry.moneyWiseAPI.service;

import com.Soyhenry.moneyWiseAPI.model.Elemento;

import java.util.List;

public interface ElementoService {
    Elemento crearElemento(Elemento elemento);

    List<Elemento> obtenerElementos();
}
