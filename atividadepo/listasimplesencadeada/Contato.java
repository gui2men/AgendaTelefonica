package atividadepo.listasimplesencadeada;

/**
 * Author: Gustavo
 */

public class Contato {

    private String nome;
    private String tel;
    private String end;

    public Contato(String nome, String tel, String end) {
        this.nome = nome;
        this.tel = tel;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String toString() {
        return "\nNome: " + nome + "\n-Telefone Fixo: " + tel + "\n-Endereço: " + end;
    }
}