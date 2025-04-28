/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_EjercicioBD;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author VANESA
 */
public class Cliente {
 
    public static void main(String[] args) {
        // Usar la conexión singleton para operaciones CRUD
        ClienteDAO clienteDAO = new ClienteDAO();
        DatabaseConnection singleton1=DatabaseConnection.getInstance();
        DatabaseConnection singleton2=DatabaseConnection.getInstance();
        // Crear un cliente
        clienteDAO.crearCliente("Vanessa Lopez", "vanne@example.com");
        clienteDAO.crearCliente("Johan Lindo", "Johitan@example.com");

        // Leer todos los clientes
        clienteDAO.leerClientes();

        // Actualizar un cliente (suponiendo que el ID de Juan es 1)
        clienteDAO.actualizarCliente(2, "Juan Pérez González", "juan.gonzalez@example.com");

        // Eliminar un cliente (suponiendo que el ID de Juan es 1)
        clienteDAO.eliminarCliente(1);
        
        if (singleton1==singleton2){
        System.out.println("Ambas instancias son las mismas. ");
        }
        else{
        System.out.println("Las instancias no son iguales. ");
        }
    }
}

