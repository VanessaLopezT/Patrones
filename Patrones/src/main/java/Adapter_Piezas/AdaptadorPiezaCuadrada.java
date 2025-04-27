/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Piezas;

/**
 *
 * @author VANESA
 */
public class AdaptadorPiezaCuadrada extends PiezaRedonda{
    private PiezaCuadrada piezaCuadrada;

    public AdaptadorPiezaCuadrada(PiezaCuadrada piezaCuadrada) {
        super(0);
        this.piezaCuadrada = piezaCuadrada;
    }
    
    @Override
    public double getRadio(){
        return (piezaCuadrada.getAncho()*Math.sqrt(2))/2;
    }
    
}
