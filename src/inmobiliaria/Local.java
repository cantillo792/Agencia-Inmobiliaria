/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Local extends Construcion{
    protected int precioMetro;

    public Local(int precioMetro, TipoConstrucion tipo, String ubicacion, int Metros) {
        super(tipo, ubicacion, Metros);
        this.precioMetro = precioMetro;
    }

    @Override
    public String mostrar() {
        String retorno= super.mostrar();
        retorno+= "Precio por metro : "+precioMetro+" precio : "+this.getPrecio();
        return retorno;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int getPrecio(){
        return super.getMetros()*this.precioMetro;
    }
    public int getPrecioMetro() {
        return precioMetro;
    }
    
    
}
