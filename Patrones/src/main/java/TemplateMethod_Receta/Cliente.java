/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod_Receta;

/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {
        System.out.println("---Preparando cafe---");
        Receta_AbstractTemplete recetaCafe=new RecetaCafe_ImplementationA();
        recetaCafe.preparar();
        
        System.out.println("---Preparando Te---");
        Receta_AbstractTemplete recetaTe=new RecetaTe_ImplementationB();
        recetaTe.preparar();
    }
    
}
