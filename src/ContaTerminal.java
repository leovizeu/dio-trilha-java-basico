import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da agencia!");
        int agencia = scan.nextInt();
        System.out.println("Por favor, digite o numero da conta!");
        int numeroConta = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliente = scan.nextLine();
        double saldo = 825.50;
        System.out.println("Olá, "
                + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia +
                ", conta "
                + numeroConta +
                " e seu saldo é de R$"
                + saldo +
                " reais e já está disponível para saque."
                );

    }
}
