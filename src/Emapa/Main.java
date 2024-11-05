package Emapa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexion con = new conexion();
		con.conectar();
		
		gestion_clientes ges = new gestion_clientes();
		
		Cliente cl1 = new Cliente("Oscar","Ariscain",673132, "Av.asda", 053543);
		Cliente cl2 = new Cliente("Maria","Gomez", 41341, "Avenida Siempreviva", 636530);
		Cliente cl3 = new Cliente("Mario","Zanches", 131241, "Avenida Siempreviva", 636530);

		ges.agregar_cliente(cl1);
		ges.agregar_cliente(cl2);
		ges.agregar_cliente(cl3);
		ges.mostrar_cliente();
		
		
		
		ClienteDB cliDB = new ClienteDB();
		cliDB.agregarPersona(cl1);
		cliDB.agregarPersona(cl2);
		cliDB.agregarPersona(cl3);
		
		
		
	}

}
