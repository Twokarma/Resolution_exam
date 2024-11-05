package Emapa;

import java.util.*;

public class gestion_clientes {
	private List<Cliente> listaClientes;
	
	public gestion_clientes() {
		listaClientes = new ArrayList<>();
	}
	
	public void agregar_cliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	public void mostrar_cliente() {
		for(Cliente cliente : listaClientes) {
			System.out.println("Nombre: "+cliente.getNombre());
			System.out.println("Apellido: "+cliente.getApellido());
			System.out.println("CI: "+cliente.getCi());
			System.out.println("Direccion: "+cliente.getDireccion());
			System.out.println("Celular: "+cliente.getCelular());

		}
	}
}
