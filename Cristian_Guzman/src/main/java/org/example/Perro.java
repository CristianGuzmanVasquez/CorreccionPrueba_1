package org.example;

public class Perro extends Mascota implements Adoptable{
    private static final double PRECIO_BASE = 15000.0;
    private static final double NO_VACUNADO = 1.30;
    private  String raza;
    private  boolean vacunado;
    private boolean adopcion;

    public Perro(String nombre, int edad, double peso ,String raza, boolean vacunado,  boolean adopcion) {
        super(nombre,edad,peso);
        this.raza = raza;
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
    public double calcularCosto(){
        double costo = PRECIO_BASE;
        if(isVacunado()){
            costo *= NO_VACUNADO;
        }
        return costo;
    }
}
