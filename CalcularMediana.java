import java.util.ArrayList;
import java.util.Scanner;

public class CalcularMediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        
        System.out.println("Ingrese números ordenados (ingrese '.' para terminar):");
        
        while (true) {
            String input = sc.nextLine();
            if (input.equals(".")) {
                break;
            }
            
            try {
                double numero = Double.parseDouble(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número o '.' para finalizar.");
            }
        }
        
        int n = numeros.size();
        
        if (n % 2 == 1) {
            double mediana = numeros.get(n / 2);
            System.out.println("La mediana es: " + mediana);
        } else {
            double num1 = numeros.get(n / 2 - 1);
            double num2 = numeros.get(n / 2);
            double mediana = (num1 + num2) / 2;
            System.out.println("La mediana es: " + mediana);
        }
    }
}