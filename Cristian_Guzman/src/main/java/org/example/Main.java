package org.example;

import java.util.List;
/*
* solucione pequeños errores que tenia en las clases Perro y Gato en los metodos de calcular costo y en la clase
* Mascota complete los sett que no tenian la ultima linea para poder guardar los datos ingresados (this.nombre = nombre)
* en la Clase GestorClinica la hice de cero ya que antes no la termine y el comienzo estaba mal, en la clase
* Mein la comence desde cero ya que no tenia nada los try catch no se si estan bien implementados🧐*/

public class Main {

    public static void main(String[] args){

        GestorClinica gestor = new GestorClinica();

        try {
            Perro max = new Perro("Max",3,15.5,"Labrador",true,false);
            Perro rex = new Perro("Rex",5,8.0,"Beagle",false, false);

            Gato maxGato = new Gato("Max",2,4.2,false);
            Gato luna = new Gato("Luna",4,5.1,true);

            gestor.registrarMascota(max);
            System.out.println("Max (Perro) registrado correctamente");
            gestor.registrarMascota(rex);
            System.out.println("Rex (Perro) registrado correctamente");
            gestor.registrarMascota(maxGato);
            System.out.println("Max (Gato) registrado correctamente");
            gestor.registrarMascota(luna);
            System.out.println("Luna (Gato) registrado correctamente");

            max.registrarAdopcion();

            System.out.println("\n=== BUSQUEDA POR NOMBRE: \"Max\" ===");

            List<Mascota> resultados = gestor.buscarPorNombre("Max");

            for (Mascota mascota : resultados){
                if (mascota instanceof Perro){
                    Perro perro = (Perro) mascota;

                    System.out.println(
                            "Tipo: Perro | " + perro +
                                    " | Peso: " + perro.getPeso() + " kg" +
                                    " | Raza: " + perro.getRaza() +
                                    " | Vacunado: " +
                                    (perro.isVacunado() ? "Sí" : "No") +
                                    " | Adopción: " +
                                    (perro.disponibleAdopcion()
                                            ? "Disponible para adopción"
                                            : "No disponible") +
                                    " | Costo consulta: $" +
                                    String.format("%.0f", perro.calcularCosto())
                    );
                } else if (mascota instanceof Gato){
                    Gato gato = (Gato) mascota;

                    System.out.println(
                            "Tipo: Gato | " + gato +
                                    " | Peso: " + gato.getPeso() + " kg" +
                                    " | Vive en: " +
                                    (gato.isViveExterior()
                                            ? "Exterior"
                                            : "Interior") +
                                    " | Costo consulta: $" +
                                    String.format("%.0f", gato.calcularCosto())
                    );
                }
            }

            System.out.println("\n=== LISTADO DE MASCOTAS ===");

            for (Mascota mascota : gestor.listaMascotas()){
                System.out.println(mascota);
            }

        }catch (IllegalArgumentException e){
            System.out.println("Error en los datos: "+ e.getMessage());

        }
    }
}