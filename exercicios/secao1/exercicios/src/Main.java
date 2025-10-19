//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int primeiroValor = 10;
        int segundoValor = 20;
        int soma = primeiroValor + segundoValor;

        System.out.println(soma);

        char letra = 'A';

        System.out.println((int) letra);

        double priValor = 10.75;
        double segValor = 20.75;

        double soma2 = (priValor + segValor);

        System.out.println(soma2);

        long valorBilion = 2_000_000_000L;

        int valorInteiro = (int )valorBilion;
        System.out.println (valorInteiro);

        String apresentacao = "Olá, Mundo!";
        String msg = apresentacao +  "Bem-Vindo ao Java";
        System.out.println(msg);

    }
}