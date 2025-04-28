/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Boton;

/**
 *
 * @author VANESA
 */
public class BotonWindows_ConcreteProduct1 implements Boton_Product{

    @Override
    public void render() {
        System.out.println("Renderizando un botón estilo Windows.");
    }

    @Override
    public void onClick() {
        System.out.println("Vinculando un evento clic de Windows.");
    }
    
}
