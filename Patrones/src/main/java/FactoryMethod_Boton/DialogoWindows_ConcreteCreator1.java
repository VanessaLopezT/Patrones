/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Boton;

/**
 *
 * @author VANESA
 */
public class DialogoWindows_ConcreteCreator1 extends Dialogo_Creator{

    @Override
    public Boton_Product crearBoton() {
        return new BotonWindows_ConcreteProduct1();}
    
}
