package Emapa;

import java.sql.*;
public class gestion_clientesDB {
	private Connection conexion;
	public gestion_clientesDB() {
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
}
