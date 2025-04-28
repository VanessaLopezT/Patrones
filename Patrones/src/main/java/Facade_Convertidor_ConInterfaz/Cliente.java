/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade_Convertidor_ConInterfaz;

/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {
        IConvertidorFacade convertidor=new ConvertidorVideoFacade();
        convertidor.convertirVideo("Video_cumpleanios.mp4", "avi");
    }
}
