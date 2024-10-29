package Emapa;
import java.util.*;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Venta {
	private Cliente cliente; // crea una composicion con la clase Cliente
	private ArrayList<Producto> productos_vendidos;
	private LocalDate fechaActual = LocalDate.now();
	public Venta(Cliente cliente) {
		this.cliente = cliente;
		this.productos_vendidos= new ArrayList<Producto>();
	}
	
	public Venta(Cliente cliente, ArrayList<Producto> productos_vendidos, LocalDate fechaActual) {
		super();
		this.cliente = cliente;
		this.productos_vendidos = productos_vendidos;
		this.fechaActual = fechaActual;
	}

	
	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public void agregar_producto(Producto producto) {
		productos_vendidos.add(producto);
	}
	public boolean realizar_venta(Producto producto,int cantidad) {
		if(producto.getStock()>= cantidad) {
			producto.reducir_stock(cantidad);//se eliminada cantidad deseada
			productos_vendidos.add(producto);//se añade a la lista de pro vendidos
			return true;
		}else {
			System.out.println("Stock insuficiente para la compra");
			return false;
		}
	}
	
	
	public void mostrar_venta_categoria() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Cliente: "+cliente.getApellido()+"  "+cliente.getNombre()+"   Fecha: "+getFechaActual());
        System.out.println("Productos Vendido de Limpieza: ");
        for(Producto producto : productos_vendidos) {
        	if(producto.getCategoria().equals("Limpieza")) {
            	System.out.println("- "+producto.getNombre()+ " : "+producto.getPrecio());

        	}
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Productos Comestibles: ");
        for (Producto producto : productos_vendidos) {
        	if(producto.getCategoria().equals("Comestible")) {
            	System.out.println("- "+producto.getNombre()+ " : "+producto.getPrecio());
        	}
        }
        System.out.println("------------------------------------------------------------");
        //para base de datos la clasificacion de perecedero o no
        
	}
}
