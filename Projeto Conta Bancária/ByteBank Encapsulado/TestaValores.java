
public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getAgencia());

        conta.setAgencia(12312321);
        Conta conta2 = new Conta(1338, 24229);
        Conta conta3 = new Conta(1333, 242260);
        
        System.out.println(Conta.getTotal());

    }

}
