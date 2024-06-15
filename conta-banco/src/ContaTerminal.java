import java.util.Scanner;

public class ContaTerminal {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor digite o número da agência: ");
        String numeroAgencia = entrada.next();
        System.out.print("Por favor digite o número da conta: ");
        int numeroConta = entrada.nextInt();
        System.out.print("Por favor digite o nome do usuário: ");
        String nomeCliente = entrada.next();
        System.out.println("Por favor digite seu saldo: ");
        double saldoDisponivel = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoDisponivel + " já está disponível para saque!");

        entrada.close();

        
    }

}
