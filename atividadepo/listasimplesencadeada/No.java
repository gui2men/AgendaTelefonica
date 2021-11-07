package atividadepo.listasimplesencadeada;

/**
 * Author: Gustavo
 */


public class No {

    private Contato co;
    private No prox;

    public No(Contato co) {

        this.co = co;
        this.prox = null;

    }

    public Contato getP() {
        return co;
    }

    public void setP(Contato co) {
        this.co = co;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }


}