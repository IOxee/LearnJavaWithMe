package Classes.Dia5;

public class Ejercicios {
    public void saludar() {
        System.out.println("Hola desde el dia 5");
    }

    public void saludarAlguien(String nombre) {
        System.out.println("Hola " + nombre + " desde el dia 5");
    }

    public int sumarConRetorno(int a, int b) {
        return a + b;
    }

    // DIFERENCIA ENTRE STATIC Y INSTANCIA
    public static void Static_vs_Instancia() {
        String msgStatic = """
           📌 Métodos static
               ✔ Pertenecen a la clase y no requieren un objeto.
               ✔ Se llaman con NombreClase.metodo().
               ✔ No pueden acceder a variables de instancia directamente.
               
           public class MathUtils {
               static int multiplicar(int a, int b) {
                   return a * b;
               }
        
               public static void main(String[] args) {
                   System.out.println("Multiplicación: " + MathUtils.multiplicar(4, 3));
               }
           }
        """;

        String msgInstancia = """
           📌 Métodos de Instancia
               ✔ Requieren crear un objeto de la clase para ser llamados.
               ✔ Pueden acceder a variables de instancia.
               
            public class Calculadora {
                int sumar(int a, int b) {
                    return a + b;
                }
        
                public static void main(String[] args) {
                    Calculadora calc = new Calculadora(); // Crear un objeto
                    int resultado = calc.sumar(8, 4);
                    System.out.println("Suma: " + resultado);
                }
            }
        """;

        System.out.println(msgStatic);
        System.out.println(msgInstancia);
    }




}
