public class Cliente {

    //Atributos
    String nome;
    String cpf;
    Endereco endereco;

    //Métodos
    String retornarDados(){

        return "Nome" + nome + "CPF" + cpf + "Endereço" + endereco;
    }
}
