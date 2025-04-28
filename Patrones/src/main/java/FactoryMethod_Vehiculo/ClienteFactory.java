/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Vehiculo;

/**
 *
 * @author VANESA
 */
public class ClienteFactory {
    public static void main(String[] args) {
        
         // Usando el creador concreto de Coche
        FabricaVehiculos_Creator_EsAbstracto fabricaCoche=new FabricaCoche_ConcreteCreator1();
        fabricaCoche.entregarVehiculo();
        
         // Usando el creador concreto de Moto
        FabricaVehiculos_Creator_EsAbstracto fabricaMoto=new FabricaMoto_ConcreteCreator2();
        fabricaMoto.entregarVehiculo();
    }
}
