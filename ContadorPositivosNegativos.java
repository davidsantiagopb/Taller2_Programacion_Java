import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Ingresa varios valores enteros (ingresa 0 para terminar):");
        
        do {
            numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        } while (numero != 0);
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        
        System.out.print("Gráfico de números positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Gráfico de números negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        scanner.close();
    }
}