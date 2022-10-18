
public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // ( instânciando necessário new ); 
        primeiraConta.saldo = 200; // (referencia . |atributo, campo ou propriedade| ) estamos atribuindo 200;
        
        //System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100; // incrementando o valor 

        //System.out.println(primeiraConta.saldo);
        
        Conta segudaConta = new Conta(); // ( segunda instância )
        segudaConta.saldo = 50;
        System.out.println("A primeira conta tem " + primeiraConta.saldo);
        System.out.println("A segunda conta tem " + segudaConta.saldo);
        
        
        /*
        Fazendo teste, quando instânciamos um objeto todo os atributos dele é zerado ;
        exemplo: 
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numeroDaConta);
        O output vai zerado; = (valor default) boolean fica false;
        */
        
    }

}
