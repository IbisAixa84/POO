
public abstract class Cuenta {
	
	private double saldo;
	/*public Cuenta(double saldo)
	{
		this.saldo=saldo;
	}*/
	/*public  Cuenta()
	{}*/
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double informarSaldo() {
		return saldo;
	}

	public abstract void extraer(double monto);

}
