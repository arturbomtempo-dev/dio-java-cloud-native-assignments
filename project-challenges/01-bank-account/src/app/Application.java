package app;

import java.util.Scanner;

import model.BankAccount;

public class Application {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("***** Criação de Conta Bancária *****\n");

        System.out.println("Por favor, digite o número da conta: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencyNumber = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String clientName = sc.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        float balance = sc.nextFloat();
        sc.nextLine();

        BankAccount newAccount = new BankAccount(accountNumber, agencyNumber, clientName, balance);

        System.out.println(newAccount.getAccountDetails());

        sc.close();
    }
}