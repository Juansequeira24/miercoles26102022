package poo;

public class App {

	public static void main(String[] args) {
		Cuenta  cuentaJuan = new Cuenta ();
		
		cuentaJuan.PonerNombre_Cliente("Juan Martinez");
		cuentaJuan.PonerEmail("juan.martinez@gmail.com");
		cuentaJuan.PonerNumeCuenta("54789865");
		cuentaJuan.PonerNtelefono("58665477");
		//cuentaJuan.MostrarDatos();
		//cuentaJuan.Retirar(50.00);
		//cuentaJuan.Depositar(150.00);
		//cuentaJuan.Depositar(500.00);
		//cuentaJuan.Retirar(50.00);
		
		Cuenta  cuentaMaria = new Cuenta ("45335874","Maria Gonzales", "88446688", "mariagonzale@gmail.com",0.00);
		
		cuentaMaria.MostrarDatos();
		Cuenta cuentajose = new Cuenta() ;
			cuentajose.MostrarDatos();
		
	}

}
