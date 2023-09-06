import java.util.Scanner;

public class VerificadorPalíndromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        if (isPalindrome(num)) {
            System.out.println(num + " es un palíndromo.");
        } else {
            System.out.println(num + " no es un palíndromo.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return originalNum == reverse;
    }
}