package Emapa;

import java.util.ArrayList;


public class Cliente extends Comprador {
	private ArrayList<Cliente> compradores;

	public Cliente(String nombre, String apellido, int ci, String direccion, int celular,
			ArrayList<Cliente> compradores) {
		super(nombre, apellido, ci, direccion, celular);
		this.compradores = compradores;
	}
	public void agregarCliente(Cliente cliente) {
		compradores.add(cliente); // se guarda a list de compradores
	}
	public void mostrarClientes() {
		for(Cliente cliente : compradores) {
			//solo se crea el obj y se llama a este metodo para mostrar los datos
			System.out.println("Nombre: "+cliente.getNombre());
			System.out.println("Apellido: "+cliente.getApellido());
			System.out.println("CI: "+cliente.getCi());
			System.out.println("Direccion: "+cliente.getDireccion());
			System.out.println("Celular: "+cliente.getCelular());
		}
	}
	
  }
