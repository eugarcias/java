import java.util.Scanner;

public class Main {
    //    Exercício 3: Sistema de Avaliação 🌟
//    Crie um programa que peça a nota de um aluno (de 1 a 5) e exiba a avaliação correspondente.
//    Nota 5: "Excelente"
//    Nota 4: "Muito Bom"
//    Nota 3: "Bom"
//    Nota 2: "Regular"
//    Nota 1: "Insuficiente"
//    Para notas fora desse intervalo, exiba "Nota inválida."
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual nota você dá para nossa empresa? ");

        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Nota 1: Insuficiente");
                break;
            case 2:
                System.out.println("Nota 2: Regular");
                break;
            case 3:
                System.out.println("Nota 3: Bom");
                break;
            case 4:
                System.out.println("Nota 4: Muito bom");
                break;
            case 5:
                System.out.println("Nota 5: Excelente");
                break;
            default:
                System.out.println("Opção Inválida, insira um número para prosseguir!");
        }
    }
}