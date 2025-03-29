import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Ler o nome, preço, codigo e disponivel
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do seu produto: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o preço: ");
        float preco = leitor.nextFloat();

        System.out.println("Digite o código: ");
        int codigo = leitor.nextInt();

        System.out.println("Esse produto está disponível? ");
        boolean disponivel = leitor.nextBoolean();

        //Ler os dados do fornecedor

        System.out.println("Nome do fornecedor: ");
        String nomeF = leitor.next() + leitor.nextLine();

        System.out.println("Telefone: ");
        String telefone = leitor.next() + leitor.nextLine();

        System.out.println("CNPJ: ");
        String cnpj = leitor.next() + leitor.nextLine();

        //Criar um objeto Produto
        Produto produto = new Produto();
        Fornecedor fornecedor1 = new Fornecedor();

        //Colocar os dados no objeto
        produto.nome = nome;
        produto.preco = preco;
        produto.codigo = codigo;
        produto.disponivel = disponivel;

        //Atribuir o objeto fornecedor dentro do objeto produto
        produto.fornecedor = fornecedor1;

        //Colocar os dados no fornecedor
        fornecedor1.nome = nomeF;
        fornecedor1.telefone = telefone;
        fornecedor1.cnpj = cnpj;


        //Exibir os dados do objeto
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Código do produto: " + produto.codigo);
        System.out.println("Disponibilidade do produto: " + produto.disponivel);

        //Exibir os dados do fornecedor
        System.out.println("Fornecedor: " + produto.fornecedor.nome);
        System.out.println("Telefone: " + produto.fornecedor.telefone);
        System.out.println("CNPJ: " + produto.fornecedor.cnpj);

        //Aumentar o preço do produto em 20
        produto.aumentarPreco(20);

        //Exibir o preço do produto
        System.out.println("Preço atualizado " + produto.preco);

        //Calcular o desconto do produto em 7%


        //Exibir o valor do produto com o desconto

    }

}
