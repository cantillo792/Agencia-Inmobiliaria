/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public class TipoConstrucion {
    private String tipo;

    public TipoConstrucion(boolean nueva) {
        if(nueva){
            this.tipo = "nueva";
        }else{
            this.tipo="segunda mano";
        }
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
