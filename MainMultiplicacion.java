import java.util.Scanner;
public class MainMultiplicacion {
    public static void main(String[] args) {
        Multiplicacion multiplicacion1 = new Multiplicacion();
        int a,e;
        
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        a = op.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        e = op.nextInt();

        multiplicacion1.num1 = a;
        multiplicacion1.num2 = e;

        multiplicacion1.MostrarResultado();

    }
}