
package CriarConta;

public class Conta {  // ( definindo atributos e comportamentos )

    double saldo;
    int numeroDaConta;
    int agencia;
    String titular;

    public void Deposita(double valor) {

        saldo += valor;
            }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.Deposita(valor);
            return true;

        } 
            return false;

    }
    
    
    

}
