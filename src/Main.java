import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean showDia1 = false;
        boolean showDia2 = false;
        boolean showDia3 = false;
        boolean showDia4 = false;
        boolean showDia5 = true;


        // Dia 1 \\
        if (showDia1) {
            Classes.Dia1.Ejercicios.HolaMundo(args);
            System.out.println("\n");

            Classes.Dia1.Ejercicios.juan();
            System.out.println("\n");

            Classes.Dia1.Ejercicios.suma();
            System.out.println("\n");

            Classes.Dia1.Ejercicios.ascii();
            System.out.println("\n");
        }

        // Dia 2 \\
        if (showDia2) {
            Classes.Dia2.Ejercicios.TiposPrimitivos();
            System.out.println("\n");

            System.out.print("Dame un numero para convertirlo a Fahrenheit: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            Classes.Dia2.Ejercicios.CelciusToFahrenheit(input);


            System.out.println("\n");
        }

        // Dia 3 \\
        if (showDia3) {
            Classes.Dia3.Ejercicios.OperadoresAritmeticos();
            System.out.println("\n");
            Classes.Dia3.Ejercicios.OperadoresRelacionales();
            System.out.println("\n");
            Classes.Dia3.Ejercicios.OperadoresLogicos();
            System.out.println("\n");
            Classes.Dia3.Ejercicios.PrecedenciaOperadores();
            System.out.println("\n");

            Scanner s = new Scanner(System.in);

            System.out.print("Introduce un numero: ");
            int numero1 = s.nextInt();
            System.out.print("Introduce otro numero: ");
            int numero2 = s.nextInt();
            System.out.print("Introduce la operacion (+, -, *, /, %): ");
            String operacion = s.next();
            Classes.Dia3.Ejercicios.Calculadora(numero1, numero2, operacion);

            System.out.println("\n");
        }

        // Dia 4 \\
        if (showDia4) {
            Classes.Dia4.Ejercicios.Condicionales();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.CondicionalesElse();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.SwitchCase();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.ForLoop();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.WhileLoop();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.DoWhileLoop();
            System.out.println("\n");
            Classes.Dia4.Ejercicios.BreakContinue();
            System.out.println("\n");

            Classes.Dia4.Ejercicios.Adivinanza();
            System.out.println("\n");
        }

        if (showDia5) {
            Classes.Dia5.Ejercicios.Static_vs_Instancia();
            System.out.println("\n");
            Classes.Dia5.Calculadora.main(args);
        }
    }
}