/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

public class Lugar {
    private String parteDe;

    public Lugar(boolean parte) {
        if(parte){
            this.parteDe = "Publico";
        }else{
            this.parteDe = "Privado";
        }
    }

    public String getParteDe() {
        return parteDe;
    }
    
    
    
}
