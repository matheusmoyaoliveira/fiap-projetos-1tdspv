public class Pessoa {
    String nome;
    int idade;
    String cpf;
    double altura;
    String faculdade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", altura=" + altura +
                '}';
    }
}
