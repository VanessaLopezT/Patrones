/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_ConInterfaz;

import Composite_RamasYHojas_Abstract.*;

/**
 *
 * @author VANESA
 */
public class Hoja_Leaf implements Componente{
    private String nombre;
    
    public Hoja_Leaf(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void mostrar() {
        System.out.println("- Hoja: " + nombre);
    }
    
}
