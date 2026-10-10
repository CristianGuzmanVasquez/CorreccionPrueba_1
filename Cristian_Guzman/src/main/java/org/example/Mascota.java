package org.example;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private double peso;

    public Mascota(String nombre, int edad, double peso) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0 || edad > 30){
            throw new IllegalArgumentException("la edad debe estar en un rango del 0 al 30");
        }
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("el peso debe ser mayor a cero");
        }
        this.peso = peso;
    }

    public abstract double calcularCosto();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Edad: " + edad + " años";
    }

}
