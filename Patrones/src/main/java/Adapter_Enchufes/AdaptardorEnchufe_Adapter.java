/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Enchufes;

/**
 *
 * @author VANESA
 */
// 3. Adapter: Clase que adapta EnchufeDosPatas a EnchufeTresPatas
public class AdaptardorEnchufe_Adapter implements EnchufeTresPatas_Target{
    private EnchufeDosPatas_Adaptee enchufeDosPatas_Adaptee;
    
    public AdaptardorEnchufe_Adapter(EnchufeDosPatas_Adaptee enchufeDosPatas_Adaptee){
    this.enchufeDosPatas_Adaptee=enchufeDosPatas_Adaptee;
    }
    
    @Override
    public void conectar() {
        enchufeDosPatas_Adaptee.enchufar();
    }
     
}
