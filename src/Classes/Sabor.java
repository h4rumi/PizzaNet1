package Classes;

import java.util.List;

public class Sabor {

    int idSabor;
    String nome;
    double valor;
    int id_ingrediente[] = new int[3];

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int[] getId_ingrediente() {
        return id_ingrediente;
    }

    public void setIdIngrediente(int i1, int i2, int i3) {
        this.id_ingrediente[0] = i1;
        this.id_ingrediente[1] = i2;
        this.id_ingrediente[2] = i3;
    }

    public void consultarSabor(List<Sabor> sabores) {
        System.out.println("\n/----   SABORES ----/");
        for (int i = 0; i < sabores.size(); i++) {
            System.out.println("\nID: " + sabores.get(i).getIdSabor());
            System.out.println("Nome do sabor: " + sabores.get(i).getNome());
            System.out.println("Valor: " + sabores.get(i).getValor());
        }
    }

    public void consultarIngSabor(List<Sabor> sabores, List<Ingrediente> ingredientes) {
        int vetSabor[] = new int[3];
        int Id_Ingrediente;
        
        System.out.println("\n/---- INGREDIENTES DOS SABORES ----/");
        for (int i = 0; i < sabores.size(); i++) {
            System.out.println("\nID Sabor: " + sabores.get(i).getIdSabor());
            System.out.println("Nome do sabor: " + sabores.get(i).getNome());
            vetSabor = sabores.get(i).getId_ingrediente();

            for (int j = 0; j < sabores.get(i).getId_ingrediente().length; j++) {
                //System.out.printf("\nValor id ingrediente do sabor: " + vetSabor[j]);

                for (int k = 0; k < 3; k++) { //3 INGREDIENTES CADASTRADOS

                    Id_Ingrediente = ingredientes.get(k).getIdIngrediente();
                    //System.out.printf("\nValor id ingrediente do ingred: " + Id_Ingrediente);

                    if (Id_Ingrediente == vetSabor[j]) {

                        System.out.println("Ingrediente: " + ingredientes.get(k).getDescricao());
                    }
                }
            }
        }
    }

}
