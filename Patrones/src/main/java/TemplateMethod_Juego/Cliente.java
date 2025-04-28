/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Juego;

/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {
        InteligenciaArtificialJuego_Abstract iaOrcos=new IAOrcos_Subclase1();
        System.out.println("Turno de los Orcos:");
        iaOrcos.turno();
        
        InteligenciaArtificialJuego_Abstract iaMonstruos=new IAMonstruos_Subclase2();
        
        System.out.println("Turno de los Mosntruos:");
        iaMonstruos.turno();
        
    }
   
}
