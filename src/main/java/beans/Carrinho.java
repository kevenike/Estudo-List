package beans;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{

    List<ItemCarrinho> carrinho = new ArrayList<>();

    public void adicionar(ItemCarrinho itemCarrinho) {
        this.carrinho.add(itemCarrinho);
    }

    public void remover(ItemCarrinho imItemCarrinho) {
    this.carrinho.remove(imItemCarrinho);
    }

    public ItemCarrinho buscarItem(int indice) {
        return this.carrinho.get(indice);
    }

    public List<ItemCarrinho> listarItens() {
        return carrinho;
    }
}
