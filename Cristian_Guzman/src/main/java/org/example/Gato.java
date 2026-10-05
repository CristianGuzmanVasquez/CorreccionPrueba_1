package org.example;

public class Gato extends Mascota{
    public boolean viveExterior;
    /*
    * Diosito apiadate de esta pobre alma ;C
    * */


    public Gato(String nombre, int edad, double peso, boolean viveExterior){
        super(nombre, edad, peso);
        setViveExterior(viveExterior);
    }

    public boolean isViveExterior() {
        return viveExterior;
    }

    public void setViveExterior(boolean viveExterior) {
        this.viveExterior = viveExterior;
    }

    @Override
    public void calcularCosto(){

    }

}
