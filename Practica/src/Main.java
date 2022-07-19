public class Main {

    public static boolean esDivisible(int num1, int num2)
    {
        if (num1%num2 == 0){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
    int n1=5;
    int n2=2;
    if (esDivisible(n1,n2)) {
        System.out.println(n1 + " es divisible por " + n2);
    }
    else
        System.out.println(n1 + " no es divisible por " + n2);
    }
}