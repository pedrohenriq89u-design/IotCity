public class Gateway extends Dispositivo implements Conectavel {

    public Gateway(String nome) {
        super(nome);
    }

    @Override
    public void conectar() {
        IO.println(getNome() + " conectado à rede IoT.");
    }

    @Override
    public void funcionar() {
        IO.println(getNome() + " está encaminhando os dados.");
    }

    public void reiniciar() {
        IO.println(getNome() + " foi reiniciado.");
    }

}
