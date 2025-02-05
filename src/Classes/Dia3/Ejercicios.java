package Classes.Dia3;

public class Ejercicios {
    public static void OperadoresAritmeticos() {
        int a = 10;
        int b = 20;

        System.out.println("Suma: a + b = " + (a + b));
        System.out.println("Resta: a - b = " + (a - b));
        System.out.println("Multiplicación: a * b = " + (a * b));
        System.out.println("División: a / b = " + (a / b));
        System.out.println("Módulo: a % b = " + (a % b));
    }

    public static void OperadoresRelacionales() {
        int a = 10;
        int b = 20;

        System.out.println("Igual que: a == b: " + (a == b));
        System.out.println("Diferente que: a != b: " + (a != b));
        System.out.println("Mayor que: a > b: " + (a > b));
        System.out.println("Menor que: a < b: " + (a < b));
        System.out.println("Mayor o igual que: a >= b: " + (a >= b));
        System.out.println("Menor o igual que: a <= b: " + (a <= b));
    }

    public static void OperadoresLogicos() {
        boolean a = (10 > 5); // true
        boolean b = (3 < 2) ; // false

        System.out.println("AND: a && b: " + (a && b));
        System.out.println("OR: a || b: " + (a || b));
        System.out.println("NOT: !a: " + (!a));
    }

    public static void PrecedenciaOperadores() {
        int resultado = 10 + 2 * 5;
        System.out.println("Sin parentesis: 10 + 2 * 5 = " + resultado);

        resultado = (10 + 2) * 5;
        System.out.println("Con parentesis: (10 + 2) * 5 = " + resultado);
    }

    public static void Calculadora(int numero1, int numero2, String operacion) {
        switch (operacion) {
            case "+":
                System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
            case "/":
                System.out.println("División: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                break;
            case "%":
                System.out.println("Módulo: " + numero1 + " % " + numero2 + " = " + (numero1 % numero2));
                break;
            default:
                System.out.println("Operación no válida");
        }
    }
}
