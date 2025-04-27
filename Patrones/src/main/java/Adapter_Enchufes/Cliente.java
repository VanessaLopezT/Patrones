/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Enchufes;

/**
 *
 * @author VANESA
 */

// 4. Cliente: Usa la interfaz EnchufeTresPatas
public class Cliente {
    public static void main(String[] args) {
        EnchufeDosPatas_Adaptee EnchufeViejo= new EnchufeDosPatas_Adaptee();
        AdaptardorEnchufe_Adapter adaptador= new AdaptardorEnchufe_Adapter(EnchufeViejo);
        adaptador.conectar();
        
        EnchufeNuevoTresPatas_Compatible EnchufeNuevo=new EnchufeNuevoTresPatas_Compatible();
        EnchufeNuevo.conectar();
    }   
}
