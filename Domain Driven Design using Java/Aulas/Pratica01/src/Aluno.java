public class Aluno {

    //Atributos
    String nomeDoAluno;
    double cp;
    double gs;
    double challenge;
    double media;

    //Método para calcular a média
    double calcularMedia(){

        media = gs * 0.6 + challenge * 0.2 + cp * 0.2;
        return media;
    }

}
