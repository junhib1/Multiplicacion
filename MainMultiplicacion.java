import java.util.Scanner;//El código importa la clase Scanner del paquete java.util, que se usa para leer la entrada del usuario. 
public class MainMultiplicacion {//Se declara una clase llamada MainMultiplicacion.
    public static void main(String[] args) {//Se define el método principal main, que es el punto de entrada del programa.
        Multiplicacion multiplicacion1 = new Multiplicacion();//Se crea un objeto multiplicacion1 de la clase Multiplicacion.
        int a,e;//Se declaran las variables a y e de tipo entero.
        
        Scanner op = new Scanner(System.in);//Se crea un objeto op de la clase Scanner para leer la entrada del usuario.
        System.out.print("Ingresa el primer numero: ");//Se solicita al usuario que ingrese dos números (a y e) utilizando nextInt() para leer enteros.
        a = op.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        e = op.nextInt();
        multiplicacion1.setNum1(a);//Los valores ingresados por el usuario (a y e) se asignan a los objetos multiplicacion1 utilizando los métodos setNum1 y setNum2 de la clase Multiplicacion.
        multiplicacion1.setNum2(e);
        multiplicacion1.MostrarResultado();//Se llama al método MostrarResultado() del objeto multiplicacion1 para mostrar el resultado de la multiplicación.
    }
}