/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_Abstract;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VANESA
 */
public class Compuesto_Composite extends Componente_Abstract_Component{
    private List<Componente_Abstract_Component> hijos=new ArrayList<>();
    
    public Compuesto_Composite(String nombre) {
        super(nombre);
    }
    
    public void agregar(Componente_Abstract_Component componente){
       hijos.add(componente);
    }
    
    public void eliminar(Componente_Abstract_Component componente){
       hijos.remove(componente);
    }
    
    @Override
    public void mostrar() {
        System.out.println("- Compuesto: " + nombre);
        for(Componente_Abstract_Component c:hijos){
            c.mostrar();
        }
    }
    
}
