package app;

import model.Iphone;

public class Application {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n=== Testando o Reprodutor de Música ===");
        iphone.selectMusic("Bohemian Rhapsody");
        iphone.play();
        iphone.pause();
        System.out.println("Música atual: " + iphone.getCurrentMusic());

        System.out.println("\n=== Testando o Telefone ===");
        iphone.call("11999887766");
        iphone.answer();
        iphone.startVoicemail();
        System.out.println("Número atual: " + iphone.getCurrentNumber());

        System.out.println("\n=== Testando o Navegador de Internet ===");
        iphone.displayPage("https://www.google.com");
        iphone.addNewTab();
        iphone.refreshPage();
        System.out.println("URL atual: " + iphone.getCurrentUrl());

        System.out.println("\n=== Testando Entradas Inválidas ===");
        iphone.setCurrentMusic("");
        iphone.setCurrentNumber("123");
        iphone.setCurrentUrl("invalid-url");
        
        System.out.println("Música após entrada inválida: " + iphone.getCurrentMusic());
        System.out.println("Número após entrada inválida: " + iphone.getCurrentNumber());
        System.out.println("URL após entrada inválida: " + iphone.getCurrentUrl());
    }
}