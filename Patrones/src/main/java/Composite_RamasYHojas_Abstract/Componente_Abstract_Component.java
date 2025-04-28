/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_Abstract;

/**
 *
 * @author VANESA
 */
abstract class Componente_Abstract_Component {
    protected String nombre;

    public Componente_Abstract_Component(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void mostrar();
}
