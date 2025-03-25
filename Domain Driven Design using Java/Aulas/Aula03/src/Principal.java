import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Ler o nome, preço, codigo e disponivel
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do seu produto: ");
        String nome = leitor.next();

        System.out.println("Digite o preço: ");
        float preco = leitor.nextFloat();

        System.out.println("Digite o código: ");
        int codigo = leitor.nextInt();

        System.out.println("Esse produto está disponível? ");
        boolean disponivel = leitor.nextBoolean();

        //Ler os dados do fornecedor
        Scanner fornecedor = new Scanner(System.in);

        System.out.println("Nome do fornecedor: ");
        String nomeF = leitor.next();

        System.out.println("Telefone: ");
        String telefone = leitor.next();

        System.out.println("CNPJ: ");
        String cnpj = leitor.next();

        //Criar um objeto Produto
        Produto produto = new Produto();
        Fornecedor fornecedor1 = new Fornecedor();

        //Colocar os dados no objeto
        produto.nome = nome;
        produto.preco = preco;
        produto.codigo = codigo;
        produto.disponivel = disponivel;

        fornecedor1.nome = nomeF;
        fornecedor1.telefone = telefone;
        fornecedor1.cnpj = cnpj;


        //Exibir os dados do objeto
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Código do produto: " + produto.codigo);
        System.out.println("Disponibilidade do produto: " + produto.disponivel);

        System.out.println("Fornecedor: " + fornecedor1.nome);
        System.out.println("Telefone: " + fornecedor1.telefone);
        System.out.println("CNPJ: " + fornecedor1.cnpj);
    }

}
