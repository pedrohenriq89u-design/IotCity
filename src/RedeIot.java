public class RedeIot {

    private Sensor sensor;
    private Gateway gateway;

    public RedeIot(Sensor sensor, Gateway gateway) {
        this.sensor = sensor;
        this.gateway = gateway;
    }

    public void testarRede() {


        IO.println("=== TESTE DA REDE IoT ===");

        executarDispositivo(sensor);
        executarDispositivo(gateway);
    }

    private void executarDispositivo(Dispositivo dispositivo) {
        dispositivo.funcionar();
    }

}