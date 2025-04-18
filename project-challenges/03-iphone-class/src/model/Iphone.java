package model;

import model.interfaces.InternetBrowser;
import model.interfaces.MusicPlayer;
import model.interfaces.Phone;

public class Iphone implements MusicPlayer, Phone, InternetBrowser {

    private String currentMusic;
    private String currentNumber;
    private String currentUrl;

    public String getCurrentMusic() {
        return currentMusic;
    }

    public void setCurrentMusic(String currentMusic) {
        if (currentMusic.length() > 0) {
            this.currentMusic = currentMusic;
        }
    }

    public String getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(String currentNumber) {
        if (currentNumber.length() >= 11) {
            this.currentNumber = currentNumber;
        }
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        if (currentUrl.startsWith("http://") || currentUrl.startsWith("https://")) {
            this.currentUrl = currentUrl;
        }
    }

    @Override
    public void play() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando a música " + music + "...");
        this.setCurrentMusic(music);
    }

    @Override
    public void call(String number) {
        System.out.println("Chamando o número " + number + "...");
        this.setCurrentNumber(number);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo a página " + url + "...");
        this.setCurrentUrl(url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Abrindo uma nova aba no navegador...");
    }

    @Override
    public void refreshPage() {
        if (this.currentUrl != null && !this.currentUrl.isEmpty()) {
            System.out.println("Recarregando a página " + this.currentUrl + "...");
        } else {
            System.out.println("Nenhuma página para recarregar.");
        }
    }
}