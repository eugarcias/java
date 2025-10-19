
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        // Importa a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Pede para o usuario, digitar o nome
        System.out.println("Digite seu nome: ");

        // Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibi o valor
        System.out.println("Ola, " + nome + "!");

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Minha idade é " + idade + "!");

        scanner.close();
    }
}
