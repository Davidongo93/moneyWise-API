package com.Soyhenry.moneyWiseAPI.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service

    public class ElementoServiceImpl implements ElementoService {

        private List<Elemento> elementos = new ArrayList<>();


        @Override

        public Elemento crearElemento(Elemento elemento) {

            elementos.add(elemento);

            return elemento;

        }


        @Override

        public List<Elemento> obtenerElementos() {

            return elementos;

        }
    };
