public class Main {
    public static void main(String[] args) {
        Cliente Lobison = new Cliente();
        Lobison.setNome("Lobison");
        Conta cc = new ContaCorrente(Lobison);
        cc.depositar(100);
        
        Conta poupanca = new ContaPoupanca(Lobison);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
