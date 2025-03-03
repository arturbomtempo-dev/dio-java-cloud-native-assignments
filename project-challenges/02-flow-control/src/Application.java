import java.util.Scanner;

import dev.arturbomtempo.flowcontrol.exception.InvalidParametersException;

public class Application {
    public static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int interactionsNumber = secondParameter - firstParameter;

        for (int i = 1; i <= interactionsNumber; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro:");
            int firstParameter = sc.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int secondParameter = sc.nextInt();

            count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
