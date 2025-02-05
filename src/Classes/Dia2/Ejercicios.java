package Classes.Dia2;

public class Ejercicios {
    public static void TiposPrimitivos() {
        int edad = 30;
        double temperatura = 36.5;
        char inicial = 'J';
        boolean esJavaGenial = true;

        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Java es genial? " + esJavaGenial);
    }

    public static  void CelciusToFahrenheit(int input) {
        double fahrenheit = ((double) (input * 9) /5) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + "°F");
    }
}
