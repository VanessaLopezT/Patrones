/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_ConInterfaz;


/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {
        //Crear hojas
        Hoja_Leaf hoja1=new Hoja_Leaf("Hoja A");
        Hoja_Leaf hoja2=new Hoja_Leaf("Hoja B");
        
        //Crear compuesto y agregar hojas
        Compuesto_Composite rama=new Compuesto_Composite("Rama 1");
        rama.agregar(hoja1);
        rama.agregar(hoja2);
        
        
        //Crear compuesto raiz (Contiene compuesto)
        Compuesto_Composite raiz=new Compuesto_Composite("Raiz");
        raiz.agregar(rama);
        raiz.agregar(new Hoja_Leaf("Hoja c"));
        raiz.mostrar();
    
        }
}
