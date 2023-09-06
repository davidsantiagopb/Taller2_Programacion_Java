import java.util.Scanner;

public class RangoDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de datos: ");
        int n = sc.nextInt();

        double[] datos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el dato #" + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }

        double min = datos[0];
        double max = datos[0];

        for (int i = 1; i < n; i++) {
            if (datos[i] < min) {
                min = datos[i];
            }
            if (datos[i] > max) {
                max = datos[i];
            }
        }

        double rango = max - min;

        System.out.println("El rango de los datos ingresados es: " + rango);

        sc.close();
    }
}