
public class Conta {  // ( definindo atributos e comportamentos )
    double saldo ;
    int numeroDaConta;
    int agencia;
    String titular;
    
    public void Deposita(double valor){
        
        saldo += 50;
        
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        else{
            return false;
        }
    }
    
}
