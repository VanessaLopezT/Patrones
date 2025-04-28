/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade_Peliculas;

/**
 *
 * @author VANESA
 */
public class FachadaLucesYPantalla_FachadaAdicional {
    private SistemaLuces luces;
    private SistemaPantalla pantalla;

    public FachadaLucesYPantalla_FachadaAdicional() {
        luces = new SistemaLuces();
        pantalla =new SistemaPantalla();
    }
    
    public void prepararAmbiente(){
    luces.encender();
    pantalla.bajarPantalla();
    }
    
    public void apagarAmbiente(){
    pantalla.subirPantalla();
    luces.apagar();
    }
     
}
