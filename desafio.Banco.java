import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia !");
        scanner.nextLine(); // Consome a quebra de linha restante
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
