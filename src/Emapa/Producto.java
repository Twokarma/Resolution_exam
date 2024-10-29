package Emapa;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	private String categoria;
	
	public Producto(String nombre, double precio, int stock, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	public Producto(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public Producto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void Actualizar_inven() {
		System.out.println("Actualizar el inventario ");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Precio: "+getPrecio());
		System.out.println("Stock: "+getStock());
		System.out.println("Categoria: "+getCategoria());
	}
	public void reducir_stock(int cantidad) {
		this.stock -=cantidad;
	}
}
