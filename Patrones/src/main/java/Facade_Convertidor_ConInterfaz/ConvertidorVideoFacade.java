/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade_Convertidor_ConInterfaz;

/**
 *
 * @author VANESA
 */
public class ConvertidorVideoFacade implements IConvertidorFacade{
    private SistemaDecodificador decodificador;
    private SistemaCompresor compresor;
    private SistemaAlmacenamiento almacenamiento;
    
    public ConvertidorVideoFacade() {
        decodificador = new SistemaDecodificador();
        compresor = new SistemaCompresor();
        almacenamiento = new SistemaAlmacenamiento();
    }

    
    @Override
    public void convertirVideo(String archivoOrigen, String formatoDestino) {
        System.out.println("Iniciando conversion de video...");
        decodificador.decodificar(archivoOrigen);
        compresor.comprimir(archivoOrigen, formatoDestino);
        almacenamiento.guardar(archivoOrigen, formatoDestino);
        System.out.println("Conversion completa");}
    
}
