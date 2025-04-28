/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Vehiculo;

/**
 *
 * @author VANESA
 */

//Creador (Creator): Declara el método factoryMethod(), que será responsable de la creación de los objetos.
abstract class FabricaVehiculos_Creator_EsAbstracto {
    public abstract Vehiculo_Product crearVehiculo();
    
    public void entregarVehiculo(){
    Vehiculo_Product vehiculo=crearVehiculo();
    vehiculo.conducir();
    }
}
