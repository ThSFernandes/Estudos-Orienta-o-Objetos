
package CriarConta;


public class TesteReferencia {

    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        
        System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
        
        Conta segundaConta = primeiraConta;
        
        System.out.println("O sado da segunda conta é " + segundaConta.saldo);
        
        segundaConta.saldo +=200;
        System.out.println("O sado da segunda conta é " + segundaConta.saldo);
        
        System.out.println("teste " + primeiraConta.saldo);
        
        if(primeiraConta == segundaConta){
            System.out.println("São as mesmas contas");
        }
    }
    
}
