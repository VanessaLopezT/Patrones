/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Vehiculo;

/**
 *
 * @author VANESA
 */
//Producto Concreto (ConcreteProduct): Implementa la interfaz Product y define el tipo específico del producto.
public class Coche_ConcreteProduct1 implements Vehiculo_Product{

    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche. ");}
    
}
