import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lectTeclado;
        int num = 0;

        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escribe algo");
            lectTeclado = entrada.nextLine();

            System.out.println();
            System.out.println("caracterEn(" + lectTeclado + ", 7);");

            try {
                caracterEn(lectTeclado, 7);
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

        }

    }

    public static void caracterEn(String s, int i) {
        if (i >= 0 && i < s.length()) {
            System.out.println("Caracter en "+i+": "+s.charAt(i));
        } else {
            throw new RuntimeException("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}

/*
 * Crear un repositorio en GitHub con el proyecto de IntelliJ que incluya los
 * siguientes ejercicios:
 * 
 * I. Escribe una clase con un método auxiliar de nombre “caracterEn” en Java
 * que realice la siguiente acción:
 * 
 * Recibe como parámetros una cadena (String) y un entero (int);
 * Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del
 * método “length(): int” de la clase “String”) devuelve el carácter en la
 * posición correspondiente (puedes hacer uso del método “charAt(int)” de la
 * clase “String”).
 * En caso contrario, construye y lanza una excepción de tipo “Exception”, que
 * explique al usuario cual fue el error.
 * 
 * II. Construye un programa “main” en Java que realice las siguientes acciones:
 * 
 * Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar
 * (consola/CMD);
 * Lee un objeto de tipo “String” de la misma en un objeto “lectTeclado”;
 * Invoca al método “caracterEn” definido en el ejercicio anterior, con la
 * “String” leída de la entrada estándar y el entero “7”, mostrándolo por
 * pantalla;
 * Captura la posible excepción, mostrando por pantalla un mensaje: “Has
 * intentado recuperar una posición de la cadena de caracteres que no existe;”.
 * 
 * III. Define una clase “NumeroNegativoExcepcion” que herede de “Exception” y
 * que contenga un constructor sin parámetros y un constructor que reciba como
 * parámetro una “String”, de tal modo que ambos invoquen a los constructores
 * de la clase “Exception” correspondientes.
 * 
 * Construye un programa con método main para probar la excepción.
 * Solicitar al usuario un valor numérico, si el valor es positivo calcular e
 * imprimir de la raíz cuadrada. Si es negativo, lanzar la excepción
 * "NumeroNegativoExcepcion”.
 * 
 */