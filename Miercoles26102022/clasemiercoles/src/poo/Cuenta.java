package poo;

public class Cuenta {

	private String Ncuenta;
	private double saldo;
	private String nombre_cliente;
	private String Ntelefono;
	private String email;
	//Metodos constructores
	  //Metodo constructor sin parametros
	public Cuenta() {
		this("Desconocido","Desconocido", "Desconocido" , "Desconocido",0.00); 
	}
	
	  //Metodo constructor con parametros
	public Cuenta(String Ncuenta, String nombre_cliente,String Ntelefono,String email,double saldo) {
		this.Ncuenta = Ncuenta;
		this.nombre_cliente = nombre_cliente;
		this.Ntelefono = Ntelefono;
		this.email = email;
		this.saldo= saldo;
		}

	//Metodos funcionales
	public void Depositar( double montoDepositar) {
        this.saldo += montoDepositar;
        MostrarDatos();
   System.out.println("**************************************");
   System.out.println("Realizando transaccion...");
	System.out.println("El monto fue de C$" + montoDepositar);
	System.out.println("Su saldo actual es de C$" + MostrarSaldo());
	System.out.println("**************************************");
}
public void Retirar( double montoRetiro) {
   if(montoRetiro > this.saldo ) {
	   MostrarDatos();
   	System.out.println("**************************************");
   	System.out.println("Realizando transaccion...");
   	System.out.println("No tiene Saldo Suficiente");
   	System.out.println("Su saldo actual es de C$" + MostrarSaldo());
   	System.out.println("**************************************");
   }else {
	   MostrarDatos();
   	System.out.println("**************************************");
	    System.out.println("Realizando transaccion...");
	    this.saldo -= montoRetiro;
   	System.out.println("El monto  retirado fue de C$" + montoRetiro);
   	System.out.println("Su saldo actual es de C$" + MostrarSaldo());
   	System.out.println("**************************************");
   }

}
public void MostrarDatos() {
	
	System.out.println("Nombre: " + MostrarNombre_Cliente());
	System.out.println("Numero de Cuenta: " + MostrarNumeCuenta());
	System.out.println("Email: " + MostrarEmail());
	System.out.println("Telefono: " + MostrarNtelefono());
}
	//Setters
	public void PonerNumeCuenta(String Ncuenta) {
		this.Ncuenta = Ncuenta;
	}
	public void PonerSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void PonerNombre_Cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public void PonerNtelefono(String Ntelefono) {
		this.Ntelefono = Ntelefono;
	}
	public void PonerEmail(String email) {
      this.email = email;	
    }
	
	//Getters
	public String MostrarNumeCuenta() {
		return this.Ncuenta;
	}
	public double MostrarSaldo() {
		return this.saldo;
	}
	public String MostrarNombre_Cliente() {
		return this.nombre_cliente;
	}
	public String MostrarNtelefono() {
		return this.Ntelefono;
	}
	public String MostrarEmail() {
		return this.email;
    }

}