import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 0 ;

         System.out.println("Por favor digite o numero da agencia!");
        int agencia = scanner.nextInt();

          System.out.println("Digite numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua nome");
        String nome = scanner.next();

        System.out.println("Digite sua sobrenome");
        String sobrenome = scanner.next();

      

       

        // imprimir as informações

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " esta disponivel para saque");
    }

}