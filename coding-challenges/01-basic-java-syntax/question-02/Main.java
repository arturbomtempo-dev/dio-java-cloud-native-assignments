import java.util.Scanner;

/**
 * Desafio de Código: Explorando a Sintaxe Java - Questão 02
 * 
 * @author Artur Bomtempo Colen
 * @version 1.0, 02/03/2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        String category;

        if (balance < 0) {
            category = "Negativado";
        } else if (balance >= 0 && balance <= 500) {
            category = "Baixo";
        } else {
            category = "Confortavel";
        }

        System.out.println(category);

        sc.close();
    }
}