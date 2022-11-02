
public class Conta {  // ( definindo atributos e comportamentos )

    private double saldo;  // Um atributo quando privado n�o pode ser modificado e lido. Precisa de uma m�todo.
    private int numeroDaConta;
    private int agencia;
    private Cliente titular;
    private static int total; // static � da classe
    
    //Construtor padr�o , rotina de inicializa��o .
    
    public Conta (){
        
    }
    public Conta(int agencia, int numeroDaConta){
        Conta.total++;
        //System.out.println("O total de constas � " + Conta.total);
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        //System.out.println("Estou criando uma conta " + this.numeroDaConta);
    }
    

    public void deposita(double valor) {

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
            destino.deposita(valor);
            return true;

        } 
            return false;

    }
    
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numeroDaConta;
    }
    
    public void setNumero(int numeroDaConta){
        if(numeroDaConta <= 0 ){
            System.out.println("N�o pode valor menor ou igual a 0 ");
            return;
        }
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <=0 ){
            System.out.println("N�o pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
        
        
    }

    public static int getTotal() {
        return Conta.total;
    }
    
    
    
    
    

}
