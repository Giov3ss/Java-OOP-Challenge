package lancamento.chamada;

public class AppChamada implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicinado correio de Voz");
    }
}
