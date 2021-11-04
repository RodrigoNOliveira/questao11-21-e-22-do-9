import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int nmr;
        int fibo;
        int ant;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um númerro inteiro positivo maior ou igual a 0: ");
        nmr = scanner.nextInt();

        System.out.println("");
        if (nmr >= 0) {

            for (fibo = 1; fibo <= nmr; fibo++) {

                ant = a;
                a = b + a;
                b = ant;
            }
        } else {
            System.out.println("Número negativo");
        }
        System.out.println("O enésimo termo da serie de fibonacci é: " + a);

        scanner.close();
    }
}