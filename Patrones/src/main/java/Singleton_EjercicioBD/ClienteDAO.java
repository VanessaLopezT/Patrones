/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_EjercicioBD;
import java.sql.*;
/**
 *
 * @author VANESA
 */
import java.sql.*;

public class ClienteDAO {

    private DatabaseConnection dbConnection;

    public ClienteDAO() {
        dbConnection = DatabaseConnection.getInstance();
    }

    // Crear un nuevo cliente
    public void crearCliente(String nombre, String email) {
        try {
            // Verificar si el cliente ya existe
            String checkSQL = "SELECT COUNT(*) FROM clientes WHERE email = ?";
            PreparedStatement checkStmt = dbConnection.getConnection().prepareStatement(checkSQL);
            checkStmt.setString(1, email);
            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Error: Ya existe un cliente con este email.");
                return;
            }

            // Insertar nuevo cliente si no existe
            String sql = "INSERT INTO clientes (nombre, email) VALUES (?, ?)";
            PreparedStatement stmt = dbConnection.getConnection().prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Cliente creado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Leer todos los clientes
    public void leerClientes() {
        try {
            String sql = "SELECT * FROM clientes";
            Statement stmt = dbConnection.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") + ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Actualizar cliente
    public void actualizarCliente(int id, String nuevoNombre, String nuevoEmail) {
        try {
            // Verificar si el cliente existe
            String checkSQL = "SELECT COUNT(*) FROM clientes WHERE id = ?";
            PreparedStatement checkStmt = dbConnection.getConnection().prepareStatement(checkSQL);
            checkStmt.setInt(1, id);
            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("Error: No existe un cliente con ese ID.");
                return;
            }

            // Actualizar cliente si existe
            String sql = "UPDATE clientes SET nombre = ?, email = ? WHERE id = ?";
            PreparedStatement stmt = dbConnection.getConnection().prepareStatement(sql);
            stmt.setString(1, nuevoNombre);
            stmt.setString(2, nuevoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Cliente actualizado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar cliente
    public void eliminarCliente(int id) {
        try {
            // Verificar si el cliente existe
            String checkSQL = "SELECT COUNT(*) FROM clientes WHERE id = ?";
            PreparedStatement checkStmt = dbConnection.getConnection().prepareStatement(checkSQL);
            checkStmt.setInt(1, id);
            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("Error: No existe un cliente con ese ID.");
                return;
            }

            // Eliminar cliente si existe
            String sql = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement stmt = dbConnection.getConnection().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente eliminado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
