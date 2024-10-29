package Emapa;

public class Comestible extends Producto{
	private String tipo;
	private boolean perecedero;
	
	public Comestible(String nombre, double precio, int stock, String categoria, String tipo, boolean perecedero) {
		super(nombre, precio, stock, categoria);
		this.tipo = tipo;
		this.perecedero = perecedero;
	}

	public Comestible(String nombre, double precio, int stock, String categoria, String tipo) {
		super(nombre, precio, stock, categoria);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean esPerecedero() {
		return perecedero;
	}
	

}
