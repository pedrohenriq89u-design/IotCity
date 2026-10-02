import java.util.Scanner;

public class Jogo {

    private int pontos = 0;

    private Scanner scanner = new Scanner(System.in);

    private Sensor sensor;
    private Gateway gateway;
    private RedeIot rede;

    public Jogo(Sensor sensor, Gateway gateway, RedeIot rede) {

        this.sensor = sensor;
        this.gateway = gateway;
        this.rede = rede;

    }

    public void iniciar() {

        IO.println("=================================");
        IO.println("           IoTCITY");
        IO.println("      CIDADE INTELIGENTE");
        IO.println("=================================");

        IO.println("");
        IO.println("Sua missão é salvar a cidade!");

        missaoSensor();
        missaoGateway();
        missaoRede();

        finalizar();

    }

    private int lerOpcao() {

        IO.print("Escolha: ");

        while (!scanner.hasNextInt()) {

            IO.println("Digite um número.");
            scanner.next();

            IO.print("Escolha: ");

        }

        return scanner.nextInt();

    }

    private void missaoSensor() {

        IO.println("");
        IO.println("=== MISSÃO 1: SENSOR ===");
        IO.println("O Sensor de Temperatura está desligado.");
        IO.println("Qual ação você deve realizar para ajudar a cidade?");
        IO.println("");

        IO.println("1 - Conectar o sensor");
        IO.println("2 - Ignorar o sensor");
        IO.println("3 - Desligar o sensor");

        switch (lerOpcao()) {

            case 1:
                sensor.conectar();
                pontos += 20;
                IO.println("+20 pontos!");
                break;

            case 3:
                pontos -= 10;
                IO.println("Pegadinha! -10 pontos.");
                break;

            default:
                IO.println("Missão não concluída.");
                IO.println("0 pontos.");

        }

    }

    private void missaoGateway() {

        IO.println("");
        IO.println("=== MISSÃO 2: GATEWAY ===");
        IO.println("O Gateway Central apresentou uma falha.");
        IO.println("Qual ação você deve realizar para restabelecer o sistema?");
        IO.println("");

        IO.println("1 - Reiniciar o Gateway");
        IO.println("2 - Ignorar o Gateway");
        IO.println("3 - Desconectar o Gateway");

        switch (lerOpcao()) {

            case 1:
                gateway.reiniciar();
                pontos += 20;
                IO.println("+20 pontos!");
                break;

            case 3:
                pontos -= 10;
                IO.println("Pegadinha! -10 pontos.");
                break;

            default:
                IO.println("Missão não concluída.");
                IO.println("0 pontos.");

        }

    }

    private void missaoRede() {

        IO.println("");
        IO.println("=== MISSÃO 3: REDE IOT ===");
        IO.println("Os dispositivos precisam se comunicar corretamente.");
        IO.println("Qual ação você deve realizar para verificar a rede?");
        IO.println("");

        IO.println("1 - Testar a rede");
        IO.println("2 - Ignorar a rede");
        IO.println("3 - Desligar a rede");

        switch (lerOpcao()) {

            case 1:
                rede.testarRede();
                pontos += 20;
                IO.println("+20 pontos!");
                break;

            case 3:
                pontos -= 10;
                IO.println("Pegadinha! -10 pontos.");
                break;

            default:
                IO.println("Missão não concluída.");
                IO.println("0 pontos.");

        }

    }

    private void finalizar() {

        IO.println("");
        IO.println("=== FIM DO JOGO ===");
        IO.println("Pontuação: " + pontos);

        if (pontos == 60) {

            IO.println("CIDADE SALVA!");
            IO.println("Parabéns! A cidade está funcionando.");

        } else if (pontos >= 40 && pontos < 51) {

            IO.println("RESULTADO MÉDIO.");
            IO.println("A cidade foi parcialmente protegida.");

        } else {

            IO.println("CIDADE PERDIDA!");
            IO.println("A rede IoT não foi estabilizada.");

        }

    }

}