package dev.arturbomtempo.bankaccount.model;

public class BankAccount {

    private int number;
    private String agency;
    private String clientName;
    private float balance;

    public BankAccount() {
        this.number = 0;
        this.agency = "000-0";
        this.clientName = "Nenhum";
        this.balance = 0.0F;
    }

    public BankAccount(int number, String agency, String clientName, float balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public String getClientName() {
        return clientName;
    }

    public String getBalance() {
        return String.format("%.2f", balance);
    }

    public String getAccountDetails() {
        return "Olá, " + this.getClientName() + ". Obrigado por criar uma conta em nosso banco.\nSua agência é "
                + this.getAgency() + ", conta " + this.getNumber() + " e seu saldo de R$" + this.getBalance()
                + " já está disponível para saque!";
    }
}
