/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Boton;

/**
 *
 * @author VANESA
 */
abstract class Dialogo_Creator {
    public abstract Boton_Product crearBoton();
    
    public void render(){
        Boton_Product boton=crearBoton();
        boton.render();
        boton.onClick();
    }
}
