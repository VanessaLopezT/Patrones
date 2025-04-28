/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_instancia;

/**
 *
 * @author VANESA
 */
public class Singleton {
    // Paso 1: Crear una instancia privada estática de la propia clase
    private static Singleton instancia;
    
    // Paso 2: Hacer el constructor privado para evitar que se creen instancias externas
    private Singleton(){}
     
    // Paso 3: Proporcionar un método público estático que devuelva la instancia
    public static Singleton obtenerInstancia(){
    if (instancia==null){
        instancia=new Singleton();
    }
    return instancia;
    }
    
}
