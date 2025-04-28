/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_instancia;

/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {

        Singleton singleton1=Singleton.obtenerInstancia();
        Singleton singleton2=Singleton.obtenerInstancia();
        
        if (singleton1==singleton2){
        System.out.println("Ambas instancias son las mismas. ");
        }
        else{
        System.out.println("Las instancias no son iguales. ");
        }
    }
    
}
