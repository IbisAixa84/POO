import javax.sound.midi.Soundbank;

public class Main {

    /*Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
     función debe comprobar si el primer número es divisible por el segundo.
     boolean esDivisible(int n, int divisor)
     NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
     decimales.*/

    public static void main(String[] args) {
        /*
        int numero1 =4;
        int numero2 = 2;
        System.out.println(esDivisible(numero1, numero2));
        */
        Calculadora calc = new Calculadora();
        System.out.println("Multiplicacion: " + calc.multiplicar(2,3));
        System.out.println("Suma: " + calc.sumar(4,3));
        System.out.println("Resta: " + calc.restar(10,5));
        System.out.println("Dividir: " + calc.dividir(8,2));

    }

    public static String esDivisible(int num1, int num2){
        if (num1 % num2 == 0){
            return "es divisible";
        }else {
            return "no es divisible";
        }
    }
}