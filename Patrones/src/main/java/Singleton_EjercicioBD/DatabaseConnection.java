/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_EjercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author VANESA
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
     // Paso 1: Instancia única de la conexión (Singleton)
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String dbName = "mi_base_de_datos";  // Nombre de la base de datos
    private final String user = "root"; // Usuario de MySQL
    private final String password = "root"; // Contraseña de MySQL (cambiar según tu configuración)
    
    // Paso 2: Constructor privado para evitar creación de instancias externas
    private DatabaseConnection() {
        try {
            // Paso 3: Verificar si la base de datos existe, si no, crearla
            connection = DriverManager.getConnection(url, user, password);
            crearBaseDeDatosYTablas();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Paso 4: Método público para obtener la instancia única
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Método para obtener la conexión
    public Connection getConnection() {
        return connection;
    }
    
    // Método para crear la base de datos y las tablas si no existen
    private void crearBaseDeDatosYTablas() {
        try {
            // Verificar si la base de datos existe, si no, crearla
            Statement stmt = connection.createStatement();
            String sqlCreateDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(sqlCreateDB);

            // Seleccionar la base de datos
            connection = DriverManager.getConnection(url + dbName, user, password);
            stmt = connection.createStatement();

            // Crear las tablas si no existen
            String createTableSQL = "CREATE TABLE IF NOT EXISTS clientes ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nombre VARCHAR(100), "
                    + "email VARCHAR(100))";
            stmt.executeUpdate(createTableSQL);

            System.out.println("Base de datos y tabla creadas (si no existian).");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para cerrar la conexión
    public void cerrarConexion() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexion cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
