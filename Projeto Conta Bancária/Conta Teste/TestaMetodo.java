
package CriarConta;


public class TestaMetodo {

    
    public static void main(String[] args) {
        Conta contaDoThiago = new Conta();
        contaDoThiago.saldo =100;
        contaDoThiago.deposita(50);
        System.out.println(contaDoThiago.saldo);
        
        boolean conseguiuSacar = contaDoThiago.saca(40);
        System.out.println(contaDoThiago.saldo);
        System.out.println(conseguiuSacar);
        
        Conta contaDaPaloma = new Conta();
        contaDaPaloma.deposita(3000);
        
        
        
        boolean sucessoTransferencia = contaDaPaloma.transfere(1000, contaDoThiago);
        
        if(sucessoTransferencia){
            System.out.println("Transferência feita com Sucesso !");
        }else{
            System.out.println("Faltou dinheiro !");
        }
        
        System.out.println(contaDoThiago.saldo);
        System.out.println(contaDaPaloma.saldo);
            
        contaDoThiago.titular = "Thiago Salles";
        System.out.println(contaDoThiago.titular);
    }
    
}
