import beans.Carrinho;
import beans.ItemCarrinho;

import javax.swing.*;

public class ExecutarCarrinho {

    public static void main(String[] args) {

        int resposta = 1;

        do {

            ItemCarrinho item = new ItemCarrinho();
            item.setMarca(JOptionPane.showInputDialog("informe a marca do produto: "));
            item.setNome(JOptionPane.showInputDialog("informe o nome do produto: "));
            item.setValor(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do produto: ")));

            Carrinho carrinho = new Carrinho();

            carrinho.adicionar(item);


            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");

            resposta = JOptionPane.showConfirmDialog(null, "quem continuar comprando?", "CARRINHO", JOptionPane.YES_NO_OPTION);

        }while (resposta == 0);


        JOptionPane.showMessageDialog(null, "Finalizar compra");





    }
}
