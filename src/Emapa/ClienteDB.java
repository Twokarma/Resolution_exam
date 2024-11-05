package Emapa;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClienteDB {
	private Connection conexion;
	
	public ClienteDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/emapa", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	
		public void agregarPersona(Cliente cli) {
			String sql="INSERT INTO cliente(nombre,apellido,ci,direccion,celular) VALUES(?,?,?,?,?)";
			try (PreparedStatement parametro = conexion.prepareStatement(sql)){
				parametro.setString(1, cli.getNombre());
				parametro.setString(2, cli.getApellido());
				parametro.setInt(3, cli.getCi());
				parametro.setString(4, cli.getDireccion());
				parametro.setInt(5, cli.getCelular() );
				parametro.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// Edición de propiedad 
		public void editarPersona(Cliente cli, int id) { 
			String sql = "UPDATE persona SET apellido = ?, nombre = ?, ci = ?, direccion = ?, celular = ? WHERE id = ?";
			try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
				parametro.setString(1, cli.getApellido()); 
				parametro.setString(2, cli.getNombre()); 
				parametro.setInt(3, cli.getCi()); 
				parametro.setString(4, cli.getDireccion()); 
				parametro.setInt(5, cli.getCelular()); // Conversión a int si es necesario 
				parametro.setInt(6, id); parametro.executeUpdate();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
		}
		
	    // Eliminar una propiedad
	    public void eliminarCliente(int id) {
	        String sql = "DELETE FROM persona WHERE id = ?";
	        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
	            parametro.setInt(1, id);
	            parametro.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    // Obtener lista de propiedades
	    public Cliente obtenerlista(int id) {
	        String sql = "SELECT * FROM cliente WHERE id = ?";
	        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
	            parametro.setInt(1, id);
	            ResultSet rs = parametro.executeQuery();
	            if (rs.next()) {
	                return new Cliente(
	                		rs.getString("nombre"),
	                		rs.getString("apellido"), 
	                		rs.getInt("ci"), 
	                		rs.getString("direccion"),
	                		rs.getInt("celular"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	    

}
