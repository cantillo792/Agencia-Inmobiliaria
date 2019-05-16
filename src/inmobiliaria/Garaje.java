/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Garaje extends Superficie{
    protected Lugar parteDE;

    public Garaje(Lugar parteDE, int precioMetro, String ubicacion, int Metros) {
        super(precioMetro, ubicacion, Metros);
        this.parteDE = parteDE;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno+=" Lugar : "+parteDE.getParteDe();
        return retorno;//To change body of generated methods, choose Tools | Templates.
    }

    
    public String getParteDE() {
        return parteDE.getParteDe();
    }

    
    
}
