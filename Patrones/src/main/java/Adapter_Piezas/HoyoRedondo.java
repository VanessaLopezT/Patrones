/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Piezas;

/**
 *
 * @author VANESA
 */
public class HoyoRedondo {
    private double radio;

    public HoyoRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public boolean encaja(PiezaRedonda pieza){
     return this.radio>=pieza.getRadio();
    }
    
}
