/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Piezas;

/**
 *
 * @author VANESA
 */
public class ClienteAdapter {
    public static void main(String[] args) {
        HoyoRedondo hoyo= new HoyoRedondo(6);
        PiezaRedonda piezaRedondaPequeña=new PiezaRedonda(5);
        PiezaRedonda piezaRedondaGrande=new PiezaRedonda(15);
        System.out.println("Pieza Redonda Pequena encaja?: " + hoyo.encaja(piezaRedondaPequeña));
        System.out.println("Pieza Redonda Grande encaja?: " + hoyo.encaja(piezaRedondaGrande));
        
        
        PiezaCuadrada piezaPequeña=new PiezaCuadrada(6);
        PiezaCuadrada piezaGrande=new PiezaCuadrada(10);
        
        AdaptadorPiezaCuadrada adaptadorPequeña=new AdaptadorPiezaCuadrada(piezaPequeña);
        AdaptadorPiezaCuadrada adaptadorGrande=new AdaptadorPiezaCuadrada(piezaGrande);
        
        System.out.println("Pieza Cuadrada pequena encaja?: " + hoyo.encaja(adaptadorPequeña));
        System.out.println("Pieza Cuadrada grande encaja?: " + hoyo.encaja(adaptadorGrande));
        
    }
}
