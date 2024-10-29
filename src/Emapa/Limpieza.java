package Emapa;

import java.time.LocalDate;

public class Limpieza {
	private String fecha_caducidad;

	public Limpieza(String fecha_caducidad) {
		super();
		this.fecha_caducidad = fecha_caducidad;
	}

	public Limpieza() {
		super();
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	
	public int Vencido(String fecha_caducidad) {
		LocalDate currentDate = LocalDate.now();
		int dia1 = Integer.parseInt(this.fecha_caducidad.substring(0,2));
		/*
		int mes1 = Integer.parseInt(this.fecha_caducidad.substring(3,4));
		int dia2 = currentDate.getDayOfMonth();// fecha actual
		int mes2 = currentDate.getMonthValue();// fecha actual
		if(dia2 >= dia1 && mes2 >= mes1) {
			System.out.println("Vencido");
		}
		*/
		if(dia1<=15) {
			System.out.println("Alerta de Vencimiento");
		}
		return 0;
	}
	
}
