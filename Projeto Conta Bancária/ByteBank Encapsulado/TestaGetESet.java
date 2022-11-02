
public class TestaGetESet {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numeroDaConta = 1137;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        
        Cliente Thiago = new Cliente();
       // primeiraConta.titular = "Thiago";
       Thiago.setNome("Thiago Salles");
       
       
       conta.setTitular(Thiago);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
        
        System.out.println(conta.getTitular().getProfissao());
        
        
        
        /*Outro modo de se escrever 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta);
        System.out.println(Thiago);
        System.out.println(conta.getTitular());
        */
        
    }
}
