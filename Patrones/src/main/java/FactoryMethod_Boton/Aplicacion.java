/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod_Boton;

/**
 *
 * @author VANESA
 */
// La aplicación elige un tipo de creador dependiendo de la
// configuración actual o los ajustes del entorno.

public class Aplicacion {
    private Dialogo_Creator dialogo;
    
    public void inicializar(){
        String config=leerArchivoConfig();
        
        if (config.equals("windows")){
        dialogo=new DialogoWindows_ConcreteCreator1();
        }  
        else if (config.equals("web")){
        dialogo=new DialogoWeb_ConcreteCreator2();
        }  
        else {   
            throw new RuntimeException("¡Error! Sistema operativo desconocido.");
        }
    }
    
    public void main(){
    this.inicializar();
    dialogo.render();
    }
    
    private String leerArchivoConfig() {
        // Aquí podríamos leer un archivo de configuración, por simplicidad lo devolvemos como "Windows"
        return "windows";  // MINUSCULAS.Cambiar a "web" si deseas probar con Web
    }
    
    
   
}
