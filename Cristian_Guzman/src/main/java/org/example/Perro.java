package org.example;

public class Perro extends Mascota implements Adoptable{
    public  String raza;
    public  boolean vacunado;
    public String adopcion;

    public Perro(String nombre, int edad, double peso ,String raza, boolean vacunado,  String adopcion) {
        super(nombre,edad,peso);
        this.raza = raza;
        this.adopcion = adopcion;
        setVacunado(vacunado);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void estaVacundado(){
    }

    @Override
    public boolean disponibleAdopcion() {
        return true;
    }

    @Override
    public void registrarAdopcion() {
    }

    @Override
    public void calcularCosto(){

    }
}
