public class ContaCorrente {

    //Atributos
    double saldo;
    Cliente titular;

    //Métodos
    void depositar(double valor){
        saldo += valor;
    }

    void retirar(double valor){
        saldo -= valor;
    }

    double retornarSaldo(){

        return saldo;

    }

}
