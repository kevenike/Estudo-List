import beans.ItemCarrinho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ExecutarCarrinhoComList {

    public static void main(String[] args) {

        int resposta = 0;

        int quantidadeItem = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens deseja adicionar ao carrinho? "));

        List<ItemCarrinho> carrinhoList = new ArrayList<>();


        for (int c =0; c<quantidadeItem; c++){

            ItemCarrinho item = new ItemCarrinho();
            item.setNome(JOptionPane.showInputDialog("informe o nome do produto: "));
            item.setMarca(JOptionPane.showInputDialog("informe a marca do produto: "));
            item.setValor(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do produto: ")));

            carrinhoList.add(item);

            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");

        }

//        do {
//            ItemCarrinho item = new ItemCarrinho();
//            item.setNome(JOptionPane.showInputDialog("informe o nome do produto: "));
//            item.setMarca(JOptionPane.showInputDialog("informe a marca do produto: "));
//            item.setValor(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do produto: ")));
//
//            carrinhoList.add(item);
//
//            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");
//
//        }while (carrinhoList.size() < quantidadeItem);



        JOptionPane.showMessageDialog(null, "Finalizar compra");

    }


}
