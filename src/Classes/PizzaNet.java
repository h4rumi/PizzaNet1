package Classes;

import java.sql.Statement;  
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PizzaNet {
    
    public static ArrayList<Sabor> sabores = new ArrayList<>();
    public static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    public static ArrayList<Item_Ingrediente> sab_ingr = new ArrayList<>();
    
    Connection conectarBD(){
        String url = "jdbc:postgresql://localhost:5432/PizzaNet";
        String user = "postgres";
        String senha = "013niGGae0q";
        Connection con = null;
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
        }
  
        try {
            con = DriverManager.getConnection(url,user,senha);
        } catch (SQLException ex) {
            System.out.println("Conexão não pode ser realizada");
            
        }
        
        return con;
    }
    
    Statement criarStatement(Connection con){
        Statement stmt = null;
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Nao foi possivel criar statement");
        }
        return stmt;
    }
    
    void attSabores(Statement stmt,ArrayList<Sabor> sabores){
        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM public.\"SABOR\"");
            while(res.next()){
                Sabor sabor = new Sabor();
                sabor.setIdSabor(res.getInt("sbrID"));
                sabor.setNome(res.getString("sbrNome"));
                sabor.setValor(res.getDouble("sbrValor"));
                sabores.add(sabor);
            }
        } catch (SQLException ex) {
            System.out.println("Deu erro na attSab");
        }
        
    }
    
    void attIngred(Statement stmt,ArrayList<Ingrediente> ingreds){
        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM public.\"INGREDIENTE\"");
            while(res.next()){
                Ingrediente ingred = new Ingrediente();
                ingred.setIdIngrediente(res.getInt("ingID"));
                ingred.setDescricao(res.getString("ingNome"));
                ingred.setQuantidade(res.getLong("ingQtd"));
                ingred.setQuantidademinima(res.getLong("ingQtdMin"));
                ingreds.add(ingred);
            }
        } catch (SQLException ex) {
            System.out.println("Deu erro na attIngred");
        }
    }
    
    void attItemIngred(Statement stmt,ArrayList<Item_Ingrediente> itmIngred){
        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM public.\"SBR_INGR\"");
            while(res.next()){
                Item_Ingrediente itIng = new Item_Ingrediente();
                itIng.setIngID(res.getInt("ingID"));
                itIng.setSaborID(res.getInt("sbrID"));
                itIng.setQuantidade(res.getInt("sbrIngrQtd"));
                itmIngred.add(itIng);
            }
        } catch (SQLException ex) {
            System.out.println("Deu erro na attIngred");
        }
    }
    

    
    public static void main(String[] args) {
        PizzaNet pizzaASD = new PizzaNet();
        Connection con=pizzaASD.conectarBD();
        
        if(con!=null)
            System.out.println("Conexão realizada com sucesso");
        
        Statement stmt = pizzaASD.criarStatement(con);
        
        pizzaASD.attSabores(stmt,sabores);
        pizzaASD.attIngred(stmt, ingredientes);
        pizzaASD.attItemIngred(stmt, sab_ingr);
        
        new JanPrin().setVisible(true);
        
        Ingrediente ingrediente1 = new Ingrediente();
//        Ingrediente ingrediente2 = new Ingrediente();
//        Ingrediente ingrediente3 = new Ingrediente();
//
        Sabor sabor1 = new Sabor();
//        Sabor sabor2 = new Sabor();
//        Sabor sabor3 = new Sabor();

        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor();
        Fornecedor fornecedor3 = new Fornecedor();

        //List<Ingrediente> ingredientes = new ArrayList();
        //List<Sabor> sabores = new ArrayList();
        List<Fornecedor> fornecedores = new ArrayList();

//        ingrediente1.setDescricao("Azeitona");
//        ingrediente1.setIdIngrediente(1);
//        ingrediente1.setQuantidade(10);
//        ingrediente1.setQuantidademinima(1);
//
//        ingrediente2.setDescricao("Tomate");
//        ingrediente2.setIdIngrediente(2);
//        ingrediente2.setQuantidade(20);
//        ingrediente2.setQuantidademinima(2);
//
//        ingrediente3.setDescricao("Cebola");
//        ingrediente3.setIdIngrediente(3);
//        ingrediente3.setQuantidade(2);
//        ingrediente3.setQuantidademinima(3);
//
//        ingredientes.add(ingrediente1);
//        ingredientes.add(ingrediente2);
//        ingredientes.add(ingrediente3);
//
//        sabor1.setIdSabor(1);
//        sabor1.setNome("4Queijos");
//        sabor1.setValor(40.00);
//        sabor1.setIdIngrediente(1, 2, 2);
//
//        sabor2.setIdSabor(2);
//        sabor2.setNome("Portuguesa");
//        sabor2.setValor(50.00);
//        sabor2.setIdIngrediente(2, 1, 1);
//
//        sabor3.setIdSabor(3);
//        sabor3.setNome("Atum");
//        sabor3.setValor(60.00);
//        sabor3.setIdIngrediente(3, 1, 1);
//
//        sabores.add(sabor1);
//        sabores.add(sabor2);
//        sabores.add(sabor3);

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
