/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Enchufes;

/**
 *
 * @author VANESA
 */

//Clase que ya es compatible (NO necesita adaptador). 
//Si una clase ya cumple con la interfaz esperada (EnchufeNuevoTresPatas en este caso), 
//→ se conecta directamente al cliente.→ No necesita adaptador ni se involucra con él.

public class EnchufeNuevoTresPatas_Compatible implements EnchufeTresPatas_Target{
    
    @Override
    public void conectar() {
        System.out.println("Enchufe tres patas conectado");}
    
}
