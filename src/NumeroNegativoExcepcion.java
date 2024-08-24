import java.util.Scanner;

public class NumeroNegativoExcepcion extends Exception {

    NumeroNegativoExcepcion(String s) {
        super(s);

    }

    NumeroNegativoExcepcion() {
        super("No se pueden poner numeros negativos");

    }

    public static void main(String[] args) throws NumeroNegativoExcepcion {
        Scanner entrada = new Scanner(System.in);
        Double num = (double) 0;
        while (true) {

            try {
                System.out.println("Escribe un numero");
                num = entrada.nextDouble();
                entrada.nextLine();
                try {
                    if (num > 0) {
                        System.out.println(Math.sqrt(num));
                    } else {
                        throw new NumeroNegativoExcepcion("El número es negativo");
                    }
                } catch (NumeroNegativoExcepcion e) {
                    System.out.println(e);
                    
                }
            } catch (Exception e) {
                System.out.println("Tiene que ser un número");
                entrada.nextLine();
                num = (double) 0;
            }

            
            
            System.out.println();
        }

    }

}
/*
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
