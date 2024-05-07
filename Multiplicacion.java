class Multiplicacion{ //Se declara la clase Multiplicacion, que contiene métodos y variables para realizar operaciones de multiplicación.
    int num1, num2;  //Se declaran dos variables enteras
    Multiplicacion(){ //Se define el constructor de la clase Multiplicacion, que imprime un mensaje cuando se crea una instancia de la clase.
        System.out.println("SE ESTA CONSTRUYENDO LA MULTIPLICACION");
    }
    public void MostrarResultado(){//Este método imprime el resultado de la multiplicación de num1 por num2.
        System.out.println("El resultado es " + (this.num1 * this.num2));
    }
    public int getNum1() {//Estos métodos permiten obtener y establecer los valores de num1 y num2. Proporcionan encapsulación para acceder a las variables de la clase.
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    @Override
    public String toString() {//Este método devuelve una representación de cadena de la instancia de la clase Multiplicacion, mostrando los valores de num1 y num2.
        return "Multiplicacion [num1=" + num1 + ", num2=" + num2 + "]";
    }
        
}