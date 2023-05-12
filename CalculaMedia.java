import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaMedia {
    public void calculadora() {

        int i = 1;
        double nota = 0.0;

        while (i < 5) {
            double dado_recebido = 0.0;
            try {
                System.out.println("Digite a " + i + "ª nota.");
                Scanner scanner = new Scanner(System.in);
                dado_recebido = scanner.nextInt();
                nota += dado_recebido;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números, por gentileza.");
            }

        }
        System.out.println("Sua média é " + (nota / 4.0) + ".");

    }
}
