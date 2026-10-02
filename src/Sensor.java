public class Sensor extends Dispositivo implements Conectavel {

    public Sensor(String nome) {
        super(nome);
    }

    @Override
    public void conectar() {
        IO.println(getNome() + " conectado à rede IoT.");
    }

    @Override
    public void funcionar() {
        IO.println(getNome() + " está coletando e enviando dados.");
    }

}