/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class Zona {
    private String estaEN;

    public Zona(boolean zona) {
        if(zona){
            this.estaEN = "Rustica";
        }else{
            this.estaEN = "Urbana";
        }
    }

    public String getEstaEN() {
        return estaEN;
    }
    
    
    
    
    
}
