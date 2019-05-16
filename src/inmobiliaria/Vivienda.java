/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Vivienda extends Construcion {
    protected int precio;
    protected int numabitantes;
    protected int piso;

    public Vivienda(int precio, int numabitantes, int piso, TipoConstrucion tipo, String ubicacion, int Metros) {
        super(tipo, ubicacion, Metros);
        this.precio = precio;
        this.numabitantes = numabitantes;
        this.piso = piso;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno +=" precio : "+precio+" numero de abitantes : "+numabitantes+" piso :"+piso;
        return retorno;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumabitantes() {
        return numabitantes;
    }

    public void setNumabitantes(int numabitantes) {
        this.numabitantes = numabitantes;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    
    
}
