package br.com.fiap.hospital.view;
import br.com.fiap.hospital.model.Medico;
import br.com.fiap.hospital.model.Cirurgiao;

public class Main {

    public static void main(String[] args) {

        //Instanciar um Médico
        Medico medico = new Medico("Matheus", 25973, "Geral", true);
        Cirurgiao cirurgiao = new Cirurgiao("Luisa", 25864, true);

        //Exibir os valores dos atributos do médico
        System.out.println("Nome: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Ativo: " + medico.isAtivo());

        //Exibir os valores dos atributos do cirurgião
        System.out.println("Nome: " + cirurgiao.getNome());
        System.out.println("CRM: " + cirurgiao.getCrm());
        System.out.println("Ativo: " + cirurgiao.isAtivo());

    }

}
