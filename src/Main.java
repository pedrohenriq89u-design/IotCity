//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Sensor sensor = new Sensor("Sensor de Temperatura");

        Gateway gateway = new Gateway("Gateway Central");

        RedeIot rede = new RedeIot(sensor, gateway);

        Jogo jogo = new Jogo(sensor, gateway, rede);

        jogo.iniciar();
    }

}
