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
public class Cliente {
    public static void main(String[] args) {
        EditorDeImagenes editor = new EditorDeImagenes();
        editor.cargar();
        
        // Simular selección de componentes
        List<Grafico_Component> seleccionados = new ArrayList<>();
        seleccionados.add(new Punto_Leaf(10, 20));
        seleccionados.add(new Circulo_LeafExtend(30, 40, 5));
        
        for(Grafico_Component g: seleccionados){
        editor.getTodos().agregar(g);
        }
        
        System.out.println("\nAntes de agrupar:");
        editor.dibujar();

        editor.agruparSeleccionados(seleccionados);

        System.out.println("\nDespues de agrupar:");
        editor.dibujar();
    }
    
    
}
