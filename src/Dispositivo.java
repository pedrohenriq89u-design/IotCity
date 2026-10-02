public abstract class Dispositivo {

    private String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void funcionar();

}
