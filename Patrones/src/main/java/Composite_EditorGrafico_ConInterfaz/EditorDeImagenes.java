/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_EditorGrafico_ConInterfaz;

import java.util.List;

/**
 *
 * @author VANESA
 */
public class EditorDeImagenes {
    private CompuestoGrafico_Composite todos;
    
    public void cargar(){
    todos=new CompuestoGrafico_Composite();
    todos.agregar(new Punto_Leaf(1,2));
    todos.agregar(new Circulo_LeafExtend(5,2,10));
    System.out.println("Cargado el Editor con Punto y Círculo.");
    }
    
    public void agruparSeleccionados(List<Grafico_Component> componentes){
        CompuestoGrafico_Composite grupo = new CompuestoGrafico_Composite();
        for(Grafico_Component componente: componentes){
            grupo.agregar(componente);
            todos.elimianr(componente);
        }
        todos.agregar(grupo);
        System.out.println("Componentes agrupados.");
    }
    
    public void dibujar() {
        todos.dibujar();
    }

    public CompuestoGrafico_Composite getTodos() {
        return todos;
    }
}
