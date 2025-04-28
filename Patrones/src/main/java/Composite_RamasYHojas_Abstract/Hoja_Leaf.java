/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_Abstract;

/**
 *
 * @author VANESA
 */
public class Hoja_Leaf extends Componente_Abstract_Component{

    public Hoja_Leaf(String nombre) {
        super(nombre);
    }
    
    @Override
    public void mostrar() {
        System.out.println("- Hoja: " + nombre);
    }
    
}
