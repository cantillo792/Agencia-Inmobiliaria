/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;


public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lugar lugar= new Lugar(true);
        Lugar lugar2=new Lugar(false);
        Zona zona =new Zona(true);
        Zona zona2 =new Zona(false);
        TipoConstrucion tipo =new TipoConstrucion(true);
        TipoConstrucion tipo2 =new TipoConstrucion(false);
        Garaje garaje=new Garaje(lugar, 10,"El Parque",20);
        Garaje garaje1=new Garaje(lugar2, 30,"Ciudadela",30);
        Garaje garaje2=new Garaje(lugar, 40,"Mamatoco",40);
        Local locale= new Local(20, tipo, "Centro", 30);
        Local locale1= new Local(10, tipo2, "Mercado", 40);
        Local locale2= new Local(13, tipo2, "Bastidas", 50);
        Solar solar=new Solar(zona, 15,"Almendros", 30);
        Solar solar1=new Solar(zona, 17,"Villa Marbella", 40);
        Solar solar2=new Solar(zona2, 19,"Los Nogales", 50);
        Vivienda vivienda= new Vivienda(200, 4, 203, tipo, "La Paz", 20);
        Vivienda vivienda1= new Vivienda(220, 3, 204, tipo2, "Pescaito", 32);
        Vivienda vivienda2= new Vivienda(250, 5, 205, tipo, "Garagoa", 40);
        ArrayList<Inmueble> inmuebles= new ArrayList<>();
        inmuebles.add(solar);
        inmuebles.add(solar1);
        inmuebles.add(solar2);
        inmuebles.add(vivienda);
        inmuebles.add(vivienda1);
        inmuebles.add(vivienda2);
        inmuebles.add(locale);
        inmuebles.add(locale1);
        inmuebles.add(locale2);
        inmuebles.add(garaje);
        inmuebles.add(garaje2);
        inmuebles.add(garaje1);
        for (Inmueble inmueble : inmuebles) {
            
            
            System.out.println(inmueble.mostrar());
       
        }
        Agencia agencia= new Agencia();
        
        for (Inmueble inmueble : inmuebles) {
            if(inmueble.getClass()==Solar.class || inmueble.getClass()==Vivienda.class  ){    
                agencia.añadeVentaInmueble(inmueble);
            }
            if(inmueble.getClass()==Garaje.class || inmueble.getClass()==Local.class  ){
                agencia.anadeAlquilerInmueble(inmueble);
            }
        }
        
        for (Inmueble inmueble : agencia.inmueblesVenta(500)) {
            System.out.println("-"+inmueble.mostrar());
            
        }
        for (Inmueble inmueble : agencia.localesSegundaMano(35)) {
            System.out.println("+"+inmueble.mostrar());
            
        }
        System.out.println("la cantidad de solares no urbanos en venta es :"+agencia.solaresRusticos());
        
        
        
        
        
    }
    
}
