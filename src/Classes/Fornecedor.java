package Classes;

import java.util.List;


public class Fornecedor {
    
    String nome;
    String endereco;
    int telefone;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
        public void consultarFornecedor(List<Fornecedor> fornecedores) {
        System.out.println("\n/----  FORNECEDORES    ----/");
        for (int i = 0; i < fornecedores.size(); i++) {
            System.out.println("\nNome: " + fornecedores.get(i).getNome());
            System.out.println("Endereço: " + fornecedores.get(i).getEndereco());
            System.out.println("Telefone: " + fornecedores.get(i).getTelefone());
            System.out.println("Email: " + fornecedores.get(i).getEmail());
        }
    }
}
