/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Juego;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VANESA
 */

// Clase base abstracta
abstract class InteligenciaArtificialJuego_Abstract {
    protected List<Estructura> estructurasConstruidas=new ArrayList<>();
    
    // Método plantilla: esqueleto fijo
    public final void turno(){
        recolectarRecursos();
        construirEstructuras();
        construirUnidades();
        atacar();
    }
    
    // Método implementado. usar o sobrescirbir
    protected void recolectarRecursos(){
        for (Estructura e : estructurasConstruidas){
            e.recolectar();
        }
        System.out.println("Recursos recolectados");
    }
    
    // Métodos abstractos. obligatorios
    protected abstract void construirEstructuras();
    protected abstract void construirUnidades();
    
    // Otro método plantilla, pero interno
    protected void atacar (){
        Enemigo enemigo = enemigoMasCercano();
        if(enemigo==null){
            enviarExploradores(new Posicion(0,0));
            }
        else{
            enviarGuerreros(enemigo.getPosicion());
        }       
    }
    
    protected abstract void enviarExploradores(Posicion pocision);
    protected abstract void enviarGuerreros(Posicion posicion);
    
    // Simulación de buscar enemigo
    protected Enemigo enemigoMasCercano(){
        return new Enemigo(new Posicion(10,20));
    }
    
    
    
    
}
