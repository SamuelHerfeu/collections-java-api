package Main.Java.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados(s) dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados(s) dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados(s) dentro do set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
