public class Aluno {

    //Atributos
    String nomeDoAluno;
    double cp1;
    double cp2;
    double cp3;
    double gs;
    double challenge;


    //Método para calcular a média
    double calcularMediaCp(){
        //Média aritmética
        double mediaCp = (cp1 + cp2 + cp3) / 3;
        return mediaCp;

    }


    double calcularMediaSemestral(){
        double mediaCp = calcularMediaCp();
        double media = mediaCp * 0.2 + challenge * 0.2 + gs * 0.6;
        return media;
        // return calcularMediaCp() * 0.2 + challenge * 0.2 + gs * 0.6;

    }

}
