package smartphone;

import smartphoneApple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // métodos comuns a todos smartphones
        iphone.ligar("6298765-7070");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.selecionarMusica("Rock");
        iphone.tocar();
        iphone.pausar();

        // métodos exclusivos do iPhone
        iphone.ligarFaceTime("Ariana");
        iphone.atenderFaceTime();
    }
}