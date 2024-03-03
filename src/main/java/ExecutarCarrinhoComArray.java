import beans.ItemCarrinho;

import javax.swing.*;

public class ExecutarCarrinhoComArray {
    public static void main(String[] args) {

        int resposta = 0;

        int indice = -1;

        int quantidadeItem = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens deseja adicionar ao carrinho? "));

        ItemCarrinho[] carrinhoArray = new ItemCarrinho[quantidadeItem];

        do {
            indice ++;

            if(indice < quantidadeItem){

                ItemCarrinho item = new ItemCarrinho();
                item.setMarca(JOptionPane.showInputDialog("informe a marca do produto: "));
                item.setNome(JOptionPane.showInputDialog("informe o nome do produto: "));
                item.setValor(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do produto: ")));

                carrinhoArray[indice] = item;

                resposta = JOptionPane.showConfirmDialog(null, "quem continuar comprando?", "CARRINHO", JOptionPane.YES_NO_OPTION);

                System.out.println("RESPOSTA: "+ resposta);



            }else {
                JOptionPane.showMessageDialog(null, "Carrinho cheio!");

                break;
            }

        }while(resposta==0);

        JOptionPane.showMessageDialog(null, "Finalizar compra");



    }
}