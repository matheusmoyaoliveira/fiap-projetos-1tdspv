import java.util.Scanner;

public class ex002 {

    //Tarefa: Ler do usuário o nome de um produto, a quantidade e o valor.
    // Depois ler o desconto (%). No final, calcular o valor total a ser pago.
    // Valor total: "Produto x, y itens, valor total: R$xxxx"

    public static void main(String[] args) {

        //Lendo as informações de nome e nota no teclado
        Scanner leitor = new Scanner(System.in);

        //Ler o nome do usuario
        System.out.println("Digite seu nome: ");
        String nome = leitor.next();

        //Ler o nome do produto
        System.out.println("Digite o produto: ");
        String produto = leitor.next();

        //Ler a quantidade de produtos
        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = leitor.nextInt();



    }

}
