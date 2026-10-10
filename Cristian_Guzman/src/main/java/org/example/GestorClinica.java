package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorClinica {
    private List<Mascota>mascotas;

    public GestorClinica(){
        mascotas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota){
        if(mascota == null){
            throw new IllegalArgumentException("La mascota no puede estar vacia");
        }
        mascotas.add(mascota);
    }

    public List<Mascota> buscarPorNombre(String nombre){
        List<Mascota> resultado = new ArrayList<>();

        if(nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre de la busqueda no puede estar vacio");
        }

        for (Mascota mascota : mascotas){
            if (mascota.getNombre().equalsIgnoreCase(nombre.trim())){
                resultado.add(mascota);
            }
        }
        return resultado;
    }

    public List<Mascota> listaMascotas(){
        return new ArrayList<>(mascotas);
    }
}


