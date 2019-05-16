/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Superficie extends Inmueble{
    protected int precioMetro;

    public Superficie(int precioMetro, String ubicacion, int Metros) {
        super(ubicacion, Metros);
        this.precioMetro = precioMetro;
    }
    @Override
    public int getPrecio(){
        return super.getMetros()*this.precioMetro;
    }

    @Override
    public String mostrar() {
        String retorno= super.mostrar();
        retorno+=" precio por metro cuadrado : "+this.precioMetro+" precio :"+this.getPrecio();
        return retorno;//To change body of generated methods, choose Tools | Templates.
    }
    

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }
    
    
    public int getPrecioMetro() {
        return precioMetro;
    }
    
    
}
