package Classes;

import java.util.ArrayList;
import java.util.List;

public class PizzaNet {

    public static void main(String[] args) {

        Ingrediente ingrediente1 = new Ingrediente();
        Ingrediente ingrediente2 = new Ingrediente();
        Ingrediente ingrediente3 = new Ingrediente();

        Sabor sabor1 = new Sabor();
        Sabor sabor2 = new Sabor();
        Sabor sabor3 = new Sabor();

        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor();
        Fornecedor fornecedor3 = new Fornecedor();

        List<Ingrediente> ingredientes = new ArrayList();
        List<Sabor> sabores = new ArrayList();
        List<Fornecedor> fornecedores = new ArrayList();

        ingrediente1.setDescricao("Azeitona");
        ingrediente1.setIdIngrediente(1);
        ingrediente1.setQuantidade(10);
        ingrediente1.setQuantidademinima(1);

        ingrediente2.setDescricao("Tomate");
        ingrediente2.setIdIngrediente(2);
        ingrediente2.setQuantidade(20);
        ingrediente2.setQuantidademinima(2);

        ingrediente3.setDescricao("Cebola");
        ingrediente3.setIdIngrediente(3);
        ingrediente3.setQuantidade(2);
        ingrediente3.setQuantidademinima(3);

        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        ingredientes.add(ingrediente3);

        sabor1.setIdSabor(1);
        sabor1.setNome("4Queijos");
        sabor1.setValor(40.00);
        sabor1.setIdIngrediente(1, 2, 2);

        sabor2.setIdSabor(2);
        sabor2.setNome("Portuguesa");
        sabor2.setValor(50.00);
        sabor2.setIdIngrediente(2, 1, 1);

        sabor3.setIdSabor(3);
        sabor3.setNome("Atum");
        sabor3.setValor(60.00);
        sabor3.setIdIngrediente(3, 1, 1);

        sabores.add(sabor1);
        sabores.add(sabor2);
        sabores.add(sabor3);

        fornecedor1.setNome("João");
        fornecedor1.setEndereco("Rua das Flores 123");
        fornecedor1.setTelefone(35230001);
        fornecedor1.setEmail("joao@gmail.com");

        fornecedor2.setNome("Maria");
        fornecedor2.setEndereco("Rua das Alamedas 321");
        fornecedor2.setTelefone(35230002);
        fornecedor2.setEmail("maria@gmail.com");

        fornecedor3.setNome("José");
        fornecedor3.setEndereco("Rua dos Santos 666");
        fornecedor3.setTelefone(35230003);
        fornecedor3.setEmail("jose@gmail.com");
        
        fornecedores.add(fornecedor1);
        fornecedores.add(fornecedor2);
        fornecedores.add(fornecedor3);

        ingrediente1.consultarIngrediente(ingredientes);

        ingrediente1.consultarIngredBaixa(ingredientes);

        ingrediente1.BaixaIngred(ingredientes, "Tomate", 2);

        sabor1.consultarSabor(sabores);

        sabor1.consultarIngSabor(sabores, ingredientes);
        
        fornecedor1.consultarFornecedor(fornecedores);

    }

}
