package br.com.fiap.loja.model;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private String cupom;


    //Métodos
    //Calcula e retorna o valor com desconto
    public double calcularDesconto(int porcentagem) {
        return preco - (preco * porcentagem) / 100f;
    }

    //Calcula o desconto padrão de 5%
    public double calcularDesconto() {
        return calcularDesconto(5);
    }

    //Sobrecarga do método de calcular desconto:
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%
    public double calcularDesconto(String cupom) {
        if (cupom.equals("FIAP10")) {
            return preco - (preco * 10) / 100f;
        } else if (cupom.equals("FIAP20")) {
            return preco - (preco * 20) / 100f;
        }
    }

    //Sobrescrita do método na classe Alimento
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%, FIAP40 -> 40%
    public double calcularDesconto(String cupom) {
        if (cupom.equals("FIAP10")) {
            return preco - (preco * 10) / 100f;
        } else if (cupom.equals("FIAP20")) {
            return preco - (preco * 20) / 100f;
        } else if (cupom.equals("FIAP40")) {
            return preco - (preco * 40) / 100f;
        }
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
