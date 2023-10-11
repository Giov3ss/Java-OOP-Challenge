package lancamento.apple;

import lancamento.browser.NavegadorInternet;
import lancamento.chamada.AparelhoTelefonico;
import lancamento.musica.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica via mobile App");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica via mobile App");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via mobile App");
    }


    @Override
    public void ligar() {
        System.out.println("Ligando via mobile.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via mobile.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicinado correio de Voz via mobile.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina via mobile.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba via mobile.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Pagina via mobile.");
    }
}
