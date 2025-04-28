/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Receta;

/**
 *
 * @author VANESA
 */
abstract class Receta_AbstractTemplete {
     // El método plantilla define los pasos generales
    public final void preparar(){
       hervirAgua();
       agregarIngredientes();
       cocinar();
       servir();
    }
    
    //pasos generales
    private final void hervirAgua(){
        System.out.println("Hirviendo agua...");
    }
    
    private final void servir(){
    System.out.println("Sirviendo en la taza...");
    }
    
    protected abstract void agregarIngredientes();
    protected abstract void cocinar();
}
