package Classes.Dia4;

import java.util.Scanner;
import java.util.Random;

public class Ejercicios {
    public static void Condicionales() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void CondicionalesElse() {
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 75) {
            System.out.println("Muy bien");
        } else if (nota >= 60) {
            System.out.println("Bien");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void SwitchCase() {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }
    }

    public static void ForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public static void WhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println("Numero: " + i);
            i++;
        }
    }

    public static void DoWhileLoop() {
        Scanner s = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = s.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    break;
                case 4:
                    System.out.println("Dividir");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while(opcion != 5);

        System.out.println("Fin del programa");
        s.close();
    }

    public static void BreakContinue() {
        System.out.println("El for es de 10 iteraciones, pero se salta el 5 y termina en el 8");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Saltando numero: " + i);
                continue;
            }

            if (i == 8) {
                System.out.println("Terminando en numero: " + i);
                break;
            }

            System.out.println(i);
        }
    }

    public static void Adivinanza() {
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        int numeroSecreto = rnd.nextInt(1, 11); // Genera un número entre 1 y 10
        int intentos = 0;
        int intentosMaximos = 3;
        int numero = -1;

        System.out.println("Reglas:");
        System.out.println("1. Tienes 3 intentos para adivinar el número secreto.");
        System.out.println("2. El número secreto está entre 1 y 10.");

        do {
            System.out.print("Adivina el número secreto: ");

            if (s.hasNextInt()) {
                numero = s.nextInt();
                intentos++;

                if (numero < numeroSecreto) {
                    System.out.println("Más Alto");
                } else if (numero > numeroSecreto) {
                    System.out.println("Más Bajo");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número: " + numeroSecreto);
                    return;
                }
            } else {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                s.next();
            }

        } while (intentos < intentosMaximos);

        System.out.println("Se acabaron los intentos, el número secreto era: " + numeroSecreto);
    }
}
