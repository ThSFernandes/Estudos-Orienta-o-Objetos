
package CriarConta;


public class TestaMetodo {

    
    public static void main(String[] args) {
        Conta contaDoThiago = new Conta();
        contaDoThiago.saldo =100;
        contaDoThiago.Deposita(50);
        System.out.println(contaDoThiago.saldo);
        boolean conseguiuSacar = contaDoThiago.saca(40);
        System.out.println(contaDoThiago.saldo);
        System.out.println(conseguiuSacar);
    }
    
}
