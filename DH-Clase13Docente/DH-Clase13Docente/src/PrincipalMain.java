
public class PrincipalMain {

	public static void main(String[] args) {

		CajaAhorro ca = new CajaAhorro(1000);
		//ca.setSaldo(100);
		ca.cobrarIntereses();
		CajaAhorro ca2 = new CajaAhorro(5000);
		System.out.println(ca.informarSaldo());
		System.out.println(ca2.informarSaldo());
		if (ca.compareTo(ca2)==1)
			System.out.println("Ca es mayor");
		else if(ca.compareTo(ca2)==-1)
			System.out.println("Ca2 es mayor");
		else
			System.out.println("Son iguales");

		
		System.out.println(ca.informarSaldo());
		CuentaCorriente cc= new CuentaCorriente(5000);
		Cuenta cuenta=new CuentaCorriente(1000);


	}

}
