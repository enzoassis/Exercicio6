import java.util.Scanner;

public class exercicio6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo ");
        double raio = scan.nextDouble();

        double area = 3.14 * (raio * raio);

        System.out.println("A área do círculo equivale a: " + area);
        scan.close();
    }
}
