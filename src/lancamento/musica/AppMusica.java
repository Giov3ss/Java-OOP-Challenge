package lancamento.musica;

public class AppMusica implements ReprodutorMusical {
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica.");
    }
}
