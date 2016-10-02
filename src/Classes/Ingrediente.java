package Classes;

import java.util.List;

public class Ingrediente {

    long quantidade;
    long quantidadeMinima;
    String descricao;
    int idIngrediente;

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getQuantidademinima() {
        return quantidadeMinima;
    }

    public void setQuantidademinima(long quantidademinima) {
        this.quantidadeMinima = quantidademinima;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public void consultarIngrediente(List<Ingrediente> ingredientes) {
        System.out.println("\n/----  INGREDIENTES ----/");
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println("\nID: " + ingredientes.get(i).getIdIngrediente());
            System.out.println("Descricao: " + ingredientes.get(i).getDescricao());
            System.out.println("Quantidade: " + ingredientes.get(i).getQuantidade());
            System.out.println("Quantidade Minima: " + ingredientes.get(i).getQuantidademinima());
        }
    }

    public void consultarIngredBaixa(List<Ingrediente> ingredientes) {
        System.out.println("\n/---- INGREDIENTES COM QTD MINIMA ----/");
        for (int i = 0; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getQuantidade() <= ingredientes.get(i).getQuantidademinima()) {
                System.out.println("\n"+ingredientes.get(i).getDescricao() + " atingiu a quantidade minima: " + ingredientes.get(i).getQuantidade());
            }
        }
    }

    public void BaixaIngred(List<Ingrediente> ingredientes, String nomeIngrediente, int quantidade) {
        System.out.println("\n/---- DIMINUIR INGREDIENTES ----/");
        for (int i = 0; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getDescricao().equals(nomeIngrediente)) {
                ingredientes.get(i).setQuantidade(getQuantidade() - quantidade);
                System.out.println("\n"+nomeIngrediente + " nova quantidade: " + ingredientes.get(i).getQuantidade());
            }
        }
    }

}
