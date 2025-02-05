package Classes.Dia5;
import java.util.Scanner;

public class Calculadora {
     static int sumar(int a, int b) {
        return a + b;
    }

     static int restar(int a, int b) {
        return a - b;
    }

     static int multiplicar(int a, int b) {
        return a * b;
    }

     static int dividir(int a, int b) {
        return a / b;
    }

     static int modulo(int a, int b) {
        return a % b;
    }

     static void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero2 = s.nextInt();

        System.out.print("Introduce la operacion (+, -, *, /, %): ");
        String operacion = s.next().charAt(0) + "";

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case "+": resultado = sumar(numero1, numero2); break;
            case "-": resultado = restar(numero1, numero2); break;
            case "*": resultado = multiplicar(numero1, numero2); break;
            case "/": resultado = dividir(numero1, numero2); break;
            case "%": resultado = modulo(numero1, numero2); break;
            default: operacionValida = false; break;
        }

        if (operacionValida) {
            mostrarResultado((int)resultado);
        } else {
            System.out.println("Operacion no valida");
        }

        s.close();
    }
}
