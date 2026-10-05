package org.example;

public class Gato extends Mascota{
    private static final double PRECIO_BASE = 12000.0;
    private static final double VIVE_EN_EXTERIOR = 1.15;
    private boolean viveExterior;
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
    public double calcularCosto(){
        double costo = PRECIO_BASE;
        if(!isViveExterior()){
            costo += VIVE_EN_EXTERIOR;
        }
        return costo;
    }

}
