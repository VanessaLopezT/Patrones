/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_RamasYHojas_ConInterfaz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VANESA
 */
public class Compuesto_Composite implements Componente{
    private String nombre;
    private List<Componente> hijos=new ArrayList<>();
    
    public Compuesto_Composite(String nombre) {
        this.nombre=nombre;
    }
    
    public void agregar(Componente componente){
       hijos.add(componente);
    }
    
    public void eliminar(Componente componente){
       hijos.remove(componente);
    }
    
    @Override
    public void mostrar() {
        System.out.println("- Compuesto: " + nombre);
        for(Componente c:hijos){
            c.mostrar();
        }
    }
    
}
