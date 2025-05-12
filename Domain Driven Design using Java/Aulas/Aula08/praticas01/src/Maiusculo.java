import javax.swing.*;

public class Maiusculo {
    public static void main(String[] args) {
        //Ler uma palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

        //Transformar em maiusculo
        String novaPalavra = palavra.toUpperCase();

        //Exibir a palavra
        System.out.println(novaPalavra);
        JOptionPane.showMessageDialog(null, novaPalavra);



    }
}
