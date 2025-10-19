import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");

        int num1 = scanner.nextInt();

        System.out.println("--Tabuada---\n" +
                "1 - Adição\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");

        int operacao = scanner.nextInt();

        System.out.println("Insira outro número: ");
        int num2 = scanner.nextInt();

        System.out.println();

        switch (operacao) {
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;

            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;

            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: não é possivel dividir por zero");
                } else {
                    System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
                }
                break;

            default:
                System.out.println("Operação Inválida! Por favor, insira um número");
                break;
        }
        scanner.close();
    }
}
