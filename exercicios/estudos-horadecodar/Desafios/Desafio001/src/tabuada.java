import java.util.Scanner;

public class tabuada {
    private static Object scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Tabuada---\n" +
                "Insira um número: ");

        int num1 = scanner.nextInt();

        System.out.println("Insira outro número: ");
        int num2 = scanner.nextInt();

        System.out.println();

        System.out.println(num1 + num2);
    }
}
