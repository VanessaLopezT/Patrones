/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_EditorGrafico_ConInterfaz;

/**
 *
 * @author VANESA
 */
public class Punto_Leaf implements Grafico_Component{
    protected int x, y;

    public Punto_Leaf(int dx, int dy) {
        this.x = dx;
        this.y = dy;
    }
    
    @Override
    public void mover(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja un Punto en (" + x + ", " + y + ")");
    }
    
}
