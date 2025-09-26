import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Verificador de Estação do Ano 🌸
//        Crie um programa que, dado o número de um mês (de 1 a 12), determine a estação do ano.
//        Março a Maio: Primavera
//        Junho a Agosto: Verão
//        Setembro a Novembro: Outono
//        Dezembro a Fevereiro: Inverno
//        Para qualquer outro valor, mostre "Número inválido."
//        Dica: Você pode agrupar os meses com a mesma estação usando cases em sequência.    }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12: ");
        int mes = scanner.nextInt();

        switch (mes){
            case 3:
            case 4:
            case 5:
                System.out.println("É Outono, que palhaa!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("É Inverno, meu deuzzz que frioo");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("É Primavera, está quase chegando o verãooo");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("É Verão, bora pra praiaaaa!");
                break;
            default:
                System.out.println("Opção Inválida, insira um número!");
        }
        scanner.close();
    }

}