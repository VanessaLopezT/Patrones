/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade_Peliculas;

/**
 *
 * @author VANESA
 */
public class FachadaCineEnCasa_FachadaPrincipal {
    private SistemaAudio audio;
    private FachadaLucesYPantalla_FachadaAdicional lucesYpantalla;

    public FachadaCineEnCasa_FachadaPrincipal() {
        audio = new SistemaAudio();
        lucesYpantalla =new FachadaLucesYPantalla_FachadaAdicional();
    }
    
     public void verPelicula() {
        System.out.println("Preparando todo para ver una pelicula...");
        lucesYpantalla.prepararAmbiente();
        audio.encender();
        System.out.println("Todo listo! Disfruta tu pelicula");
    }
   
     public void terminarPelicula() {
        System.out.println("Apagando todo despues de la pelicula...");
        audio.apagar();
        lucesYpantalla.apagarAmbiente();
        System.out.println("Todo apagado. Fin de la funcion");
    }
    
   
     
}
