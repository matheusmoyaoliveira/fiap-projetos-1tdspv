import javax.swing.*;

public class Vogal {
    public static void main(String[] args) {
        //Ler uma palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

        // String vogais = "aeiou";

        // for (int i = 0; i < vogais.length(); i++) {
            //Substituir as vogais da palavra
        //     palavra = palavra.replace(vogais.charAt(i), '*');
        // }

        palavra = palavra.replaceAll("[aeiou]", "*");

        //Exibi a palavra modificada
        JOptionPane.showMessageDialog(null, palavra);
    }
}
