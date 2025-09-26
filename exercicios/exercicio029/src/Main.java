import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Crie um programa que peça ao usuário para digitar uma única letra do alfabeto. Use a estrutura switch-case para verificar se a letra é uma vogal ou uma consoante.
//        Use case para cada uma das vogais: a, e, i, o, u.
//        Use a opção default para tratar todas as outras letras como consoantes.
//        Exemplo:Se o usuário digitar e, a saída deve ser "A letra 'e' é uma vogal."
//        Se o usuário digitar z, a saída deve ser "A letra 'z' é uma consoante."
//        Dica: Você pode agrupar vários case para um mesmo resultado. Por exemplo:
//        case 'a':
//        case 'e':
//        System.out.println("É uma vogal.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma única letra:");
        String entrada = scanner.next();

        char letra = entrada.toLowerCase().charAt(0);

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra " +letra + " aé uma vogal");
                break;

            default:

            if (letra >= 'a' && letra <= 'z') {
                System.out.println("A letra " + letra + "é uma consoante.");
            } else {
                System.out.println("Entrada inválida, por favor digite apenas uma única letra");
            }
            break;
        }
         scanner.close();

    }
}