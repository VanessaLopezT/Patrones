/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_EditorGrafico_ConInterfaz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VANESA
 */
public class CompuestoGrafico_Composite implements Grafico_Component{
    private List<Grafico_Component> hijos=new ArrayList<>();
    
    public void agregar(Grafico_Component grafico){
    hijos.add(grafico);
    }
    
    public void elimianr(Grafico_Component grafico){
    hijos.remove(grafico);
    }
    
    @Override
    public void mover(int x, int y) {
        for(Grafico_Component g: hijos){
            g.mover(x, y);}
            
         }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Compuesto:");
        for(Grafico_Component g: hijos){
            g.dibujar();
        }
        System.out.println("Fin de Compuesto.");
            }
}
