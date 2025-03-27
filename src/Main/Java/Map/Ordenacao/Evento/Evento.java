package Main.Java.Map.Ordenacao.Evento;

public class Evento {
    //atributos
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Main.Java.Map.Ordenacao.Evento.Evento{" +
                "nome='" + nome + '\'' +
                ", atracao=" + atracao +
                '}';
    }
}