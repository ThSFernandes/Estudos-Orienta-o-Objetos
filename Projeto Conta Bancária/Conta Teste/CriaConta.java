package CriarConta;


public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // ( parar instanciar � necess�rio new ) 
        primeiraConta.saldo = 200; // (refer�ncia . |atributo = campo = propriedade| ) estamos atribuindo 200;
        
        //System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100; // incrementando o valor 

        //System.out.println(primeiraConta.saldo);
        
        Conta segudaConta = new Conta(); // ( segunda inst�ncia )
        segudaConta.saldo = 50;
        System.out.println("A primeira conta tem " + primeiraConta.saldo);
        System.out.println("A segunda conta tem " + segudaConta.saldo);
        
        
        /*
        Fazendo teste, quando inst�nciamos um objeto todo os atributos dele � zerado ;
        exemplo: 
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numeroDaConta);
        O output vai zerado; = (valor default) boolean fica false;
        */
        
    }

}