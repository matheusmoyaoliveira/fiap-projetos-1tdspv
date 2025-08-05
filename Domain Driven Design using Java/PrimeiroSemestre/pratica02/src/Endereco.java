public class Endereco {

    //Atributos
    String logradouro;
    short numero;
    String complemento;
    String cep;

    //Métodos
    String retornarEndereco(){

        return "Logradouro" + logradouro + "Numero" + numero + "Compl." + complemento + "CEP" + cep;
    }
}
