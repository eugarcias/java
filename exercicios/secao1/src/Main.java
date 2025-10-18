//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // tipo - valor - atribuir o valor da variavel

        String nome = "Mauricio";
        int idade = 21;

        System.out.println(nome + idade);

        // 2 - atribuiçao de variavel com oiutra

        String teste = "teste";
        String testando = teste;

        System.out.println(testando);

        String firstName = "Erica";
        String lastName = "Ama o Maurício SZ ";

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = (firstName + " " + lastName);

        char letra = 'a';

        System.out.println(letra);


        // long

        long populacaoMundial = 123_321_456_456L;
        System.out.println(populacaoMundial + 5);

    }
}