package atividadepo.listasimplesencadeada;

/**
 * Author: Gustavo
 */


import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        ListaContatos l = new ListaContatos();
        String menu = "Menu de Opções Lista de contatos\n1 - Adicionar contato\n2- Remover contato\n3 - Ver lista de contatos ";
        int op = 0;
        String telefone, nome, end, remove;
        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome do contato: ");
                    telefone = JOptionPane.showInputDialog("Digite o telefone fixo: ");
                    end = JOptionPane.showInputDialog("Digite o seu endereco: ");
                    l.adiciona(new Contato(nome, telefone, end));
                    JOptionPane.showMessageDialog(null, l.imprimir());
                    System.out.println(l.imprimir());
                    break;
                case 2:

                    remove = JOptionPane.showInputDialog("Qual contato deseja apagar: ");
                    l.remove(remove);
                    JOptionPane.showMessageDialog(null, l.imprimir());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, l.imprimir());
            }

        }
    }

}