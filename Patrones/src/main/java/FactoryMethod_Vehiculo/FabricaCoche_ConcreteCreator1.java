/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Vehiculo;

/**
 *
 * @author VANESA
 */

//Creador Concreto (ConcreteCreator): Implementa el método factoryMethod() para devolver una instancia de un ConcreteProduct.
public class FabricaCoche_ConcreteCreator1 extends FabricaVehiculos_Creator_EsAbstracto{

    @Override
    public Vehiculo_Product crearVehiculo() {
        return new Coche_ConcreteProduct1();
    }
    
    
}
