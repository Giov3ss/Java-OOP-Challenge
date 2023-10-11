package Apple;

import lancamento.apple.Iphone;
import lancamento.browser.NavegadorInternet;
import lancamento.chamada.AparelhoTelefonico;
import lancamento.musica.ReprodutorMusical;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        ReprodutorMusical reprodutorMusical = iphone1;
        AparelhoTelefonico aparelhoTelefonico = iphone1;
        NavegadorInternet navegadorInternet = iphone1;

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
