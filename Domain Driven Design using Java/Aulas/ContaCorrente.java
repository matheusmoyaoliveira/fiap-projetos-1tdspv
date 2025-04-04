public class ContaCorrente {

    //Atributos
    double saldo;
    Cliente titular;

    //Métodos
    void depositar(double valor){

        saldo = saldo + valor;
    }

    void retirar(double valor){

    }

    double retornarSaldo(){
        return saldo;
    }

}
