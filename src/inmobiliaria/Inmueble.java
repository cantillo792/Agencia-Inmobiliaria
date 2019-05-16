/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public abstract class Inmueble {
    protected String ubicacion;
    protected int Metros;

    public Inmueble(String ubicacion, int Metros) {
        this.ubicacion = ubicacion;
        this.Metros = Metros;
    }
    
    public String mostrar(){
        String retorno ="ubicacion : ["+this.ubicacion+"] metros cuadrados :"+this.Metros;
        return retorno;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMetros() {
        return Metros;
    }

    public void setMetros(int Metros) {
        this.Metros = Metros;
    }

    protected abstract int getPrecio();

    String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getZona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
