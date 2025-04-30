import br.com.fiap.exercicio.model.Cor;
import br.com.fiap.exercicio.model.Lancha;

public class Main {
    public static void main(String[] args) {
        //Instanciar uma Cor
        Cor vermelho = new Cor();
        vermelho.alterarCor(255,0,0, "Vermelho");

        //Instanciar Lancha
        Lancha lancha = new Lancha();
        lancha.setModelo("CORAL 21");
        lancha.setCor(vermelho);
        lancha.setComprimento(10);
        lancha.setAnoFabricacao(2025);
        lancha.setQuantidadeLugares(8);
        lancha.setQuantidadeMotores(2);

        //Atribuir valores fixos para os atributos
        System.out.println("Lancha: " + lancha.getModelo());
        System.out.println("Cor: " + lancha.getCor().getNome());
        System.out.println("Comprimento: " + lancha.getComprimento());
        System.out.println("Ano de Fabricação: " + lancha.getAnoFabricacao());
        System.out.println("Quantidade de Lugares: " + lancha.getQuantidadeLugares());
        System.out.println("Quantidade de Motores: " + lancha.getQuantidadeMotores());
    }
}
