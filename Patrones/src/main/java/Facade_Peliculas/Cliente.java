/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade_Peliculas;

/**
 *
 * @author VANESA
 */
public class Cliente {
    public static void main(String[] args) {
        FachadaCineEnCasa_FachadaPrincipal cineEnCasa=new FachadaCineEnCasa_FachadaPrincipal();
        
        cineEnCasa.verPelicula();
        cineEnCasa.terminarPelicula();
    }
}
