/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Juego;

/**
 *
 * @author VANESA
 */
public class IAOrcos_Subclase1 extends InteligenciaArtificialJuego_Abstract{
    
    @Override
    protected void construirEstructuras() {
        System.out.println("Orcos construyen: granjas, luego cuarteles y finalmente fortaleza.");
   }

    @Override
    protected void construirUnidades() {
        System.out.println("Orcos construyen unidades: exploradores y guerreros segun recursos.");
    }

     @Override
    protected void enviarExploradores(Posicion posicion) {
        System.out.println("Orcos envian exploradores a posicion: (" + posicion.getX() + ", " + posicion.getY() + ")");
    }

    @Override
    protected void enviarGuerreros(Posicion posicion) {
        System.out.println("Orcos envian guerreros a atacar posicion: (" + posicion.getX() + ", " + posicion.getY() + ")");
    }
    
}
