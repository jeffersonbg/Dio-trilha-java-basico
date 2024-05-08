import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 237.48;

        System.out.println("Bem vindo ao Banco Terminal.");
        System.out.println();
        System.out.print("Digite o número da conta: ");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Agência: ");
        agencia = scan.nextLine();
        System.out.print("Nome do cliente: ");
        nomeCliente = scan.nextLine();
        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scan.close();

    }
}
