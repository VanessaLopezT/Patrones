/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_EditorGrafico_ConInterfaz;

/**
 *
 * @author VANESA
 */

//Clase hoja extendida
public class Circulo_LeafExtend extends Punto_Leaf{
    private int radio;
    
    public Circulo_LeafExtend(int dx, int dy, int radio) {
        super(dx, dy);
        this.radio=radio;
    }
    
    @Override 
    public void dibujar() {
        System.out.println("Dibuja un Circulo en (" + x + ", " + y + ") con radio " + radio);
    }
    
}
