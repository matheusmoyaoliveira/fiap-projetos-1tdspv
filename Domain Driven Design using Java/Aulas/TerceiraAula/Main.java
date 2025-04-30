//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Matheus";
        pessoa.cpf = "448-207-788-70";
        pessoa.idade = 18;
        pessoa.altura = 1.76;

        Pessoa churros = new Pessoa();

        churros.nome = "Daniel";
        churros.cpf = "123.123.123.21";
        churros.idade = 79;
        churros.altura = 1.90;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.altura);
        System.out.println(churros.nome);




    }
}