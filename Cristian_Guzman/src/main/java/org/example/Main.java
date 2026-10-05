package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){

       GestorClinica gestorClinica = new GestorClinica();

       Perro perro1 = new Perro("Max", 3, 15.5, "Labrador", true, "Disponible");
       Perro perro2 = new Perro("Rex", 5, 8.0, "Beagle", false, "Llamen a dios");
       Gato gato1 = new Gato("Max", 2, 4.2,false);
       Gato gato2 = new Gato("Luna", 4, 5.1,true);




    }
}