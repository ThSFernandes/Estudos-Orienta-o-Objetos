
public class Conta {
    
    private int numeroDaConta;
   private String titular;
  private double saldo;

    
  public Conta ( int numeroDaConta, String titular, double saldo){
      this.numeroDaConta = numeroDaConta;
      this.titular = titular;
      this.saldo = saldo;
  }
  public Conta(){
      
  }
  
  public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  


   

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

   

    public void setTitular(String titular) {
        this.titular = titular;
    }

   
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public void creditar ( double valor ){
        this.saldo -= valor;
    }
    
    public void imprimir (){
        
        System.out.println("O saldo é " + saldo);
        System.out.println("O numéro da conta é " + numeroDaConta);
        System.out.println("O nome do titular da conta é " + titular);
    }
   
    
}


