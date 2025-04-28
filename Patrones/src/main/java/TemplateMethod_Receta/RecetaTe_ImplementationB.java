/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Receta;

/**
 *
 * @author VANESA
 */
public class RecetaTe_ImplementationB extends Receta_AbstractTemplete{

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando hojas de te"); 
    }

    @Override
    protected void cocinar() {
        System.out.println("Infunsionando el te"); 
    }
    
}
