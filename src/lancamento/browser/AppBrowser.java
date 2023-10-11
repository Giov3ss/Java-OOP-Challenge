package lancamento.browser;

public class AppBrowser implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Pagina");
    }
}
