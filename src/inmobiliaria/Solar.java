/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Solar extends Superficie{
    protected Zona zona;

    public Solar(Zona zona, int precioMetro, String ubicacion, int Metros) {
        super(precioMetro, ubicacion, Metros);
        this.zona = zona;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno +=" zona : "+zona.getEstaEN();
        return retorno;//To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String getZona() {
        return zona.getEstaEN();
    }
    
    
    
}
