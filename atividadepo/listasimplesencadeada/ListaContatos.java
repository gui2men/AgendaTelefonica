package atividadepo.listasimplesencadeada;

/**
 * Author: Gustavo
 */

public class ListaContatos {
    private No prim;
    private No ult;
    private int qtd;

    public ListaContatos() {
        this.prim = null;
        this.ult = null;
        this.qtd = 0;

    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQuantino() {
        return qtd;
    }

    public void setQuantino(int quantino) {
        this.qtd = quantino;
    }

    //=----------------------------------------------------------------------
    public void adiciona(Contato co) {
        No novoNo = new No(co);
        novoNo.setP(co);
        novoNo.setProx(prim);
        prim = novoNo;
        this.qtd++;
    }

    //=----------------------------------------------------------------------
    public void inserirUltimo(Contato co) {
        No novoNo = new No(co);
        if (eVazia()) {
            this.prim = novoNo;

        } else {
            this.ult = novoNo;
        }
        this.ult = novoNo;
        this.qtd++;
    }

    //=----------------------------------------------------------------------
    public boolean remove(String nome) {
        No atual = this.prim;
        No ant = null;
        if (eVazia()) {
            return false;
        } else {
            while ((atual != null) && (!atual.getP().getNome().equals(nome))) {
                ant = atual;
                atual = atual.getProx();


            }
            if (atual == this.prim) {
                if (this.prim == this.ult) {
                    this.ult = null;
                }
                this.prim = this.prim.getProx();
            } else {
                if (atual == this.ult) {
                    this.ult = ant;
                }
                ant.setProx(atual.getProx());
            }
            System.out.println("Produto excluido: " + atual.getP().getNome());
            this.qtd--;
            return true;

        }
    }

    //=----------------------------------------------------------------------
    public boolean eVazia() {
        return (this.prim == null);

    }

    //TODO: Instanciar o metodo pesquisar no main.
//    public String pesquisarNo(String nome){
//        String msg="";
//        No atual = this.prim;
//        while((atual != null) && (!atual.getP().getNome().equals(nome))){
//            atual = atual.getProx();
//        }
//        return msg = "Nome :" +atual.getP().getNome() + "\n"+
//                     "Endereco :" +atual    .getP().getEnd() + "\n"+
//                     "Telefone :" +atual    .getP().getTel();
//    }

    //TODO: Fazer com que o metodo imprimir, imprima o numero do contato 1,2,3 assim por diante.
    public String imprimir() {
        String msg = "";
        if (eVazia()) {
            msg = "a lista esta vazia";
        } else {
            No atual = this.prim;
            while (atual != null) {
//                msg += "Contato "+qtd+ ":" + "\n";
                msg += atual.getP().getNome() + "\n";
                msg += atual.getP().getEnd() + "\n";
                msg += atual.getP().getTel() + "\n";
                atual = atual.getProx();
            }
        }
        return msg;
    }

}