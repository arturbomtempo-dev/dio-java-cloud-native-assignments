import java.util.Scanner;

/**
 * Desafio de Código: Explorando a Sintaxe Java - Questão 01
 * 
 * @author Artur Bomtempo Colen
 * @version 1.0, 02/03/2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();

        double transaction1 = sc.nextDouble();
        double transaction2 = sc.nextDouble();
        double transaction3 = sc.nextDouble();

        double finalBalance = initialBalance + transaction1 + transaction2 + transaction3;

        System.out.printf("%.2f\n", finalBalance);

        sc.close();
    }
}