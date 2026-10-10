package org.example;

public class Perro extends Mascota implements Adoptable{
    private static final double PRECIO_BASE = 15000.0;
    private static final double NO_VACUNADO = 1.30;
    private  String raza;
    private  boolean vacunado;
    private boolean dispAdopcion;

    public Perro(String nombre, int edad, double peso ,String raza, boolean vacunado,  boolean dispAdopcion) {
        super(nombre,edad,peso);
        this.raza = raza;
        setVacunado(vacunado);
        this.dispAdopcion = dispAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if(raza == null || raza.trim().isEmpty()){
            throw new IllegalArgumentException("La raza no puede estar vacia");
        }
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public boolean disponibleAdopcion() {
        return dispAdopcion;
    }

    @Override
    public void registrarAdopcion() {
        dispAdopcion = true;
    }

    @Override
    public double calcularCosto(){
        double costo = PRECIO_BASE;
        if(!isVacunado()){
            costo *= NO_VACUNADO;
        }
        return costo;
    }
}
