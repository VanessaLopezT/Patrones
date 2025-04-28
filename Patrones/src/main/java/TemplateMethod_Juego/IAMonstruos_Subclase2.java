/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Juego;

/**
 *
 * @author VANESA
 */
public class IAMonstruos_Subclase2 extends InteligenciaArtificialJuego_Abstract{
    
    @Override
    protected void recolectarRecursos(){
        System.out.println("Monstruos no recolectan recursos.");
      }
    
    @Override
    protected void construirEstructuras() {
        System.out.println("Monstruos no construyen estructuras.");
    }

    @Override
    protected void construirUnidades() {
        System.out.println("Monstruos no construyen unidades.");
    }

     @Override
    protected void enviarExploradores(Posicion posicion) {
        System.out.println("Monstruos no envían exploradores.");
    }

    @Override
    protected void enviarGuerreros(Posicion posicion) {
        System.out.println("Monstruos atacan salvajemente posicion: (" + posicion.getX() + ", " + posicion.getY()+ ")");
    }
    
}
