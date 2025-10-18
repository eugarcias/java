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

       // double

       double precoCarne = 21.33d;
        System.out.println(precoCarne);

        // Operadores Aritméticos

        int numero1 = 1;
        int numero2 = 5;
        int num3 = 10;
        int num4 = 20;

        System.out.println(numero1 + numero2 + numero2);
        int soma = numero1 + numero2;

        System.out.println(soma);

        System.out.println(num4 / numero2);

        System.out.println( 1223 % 100);

        // operadores aritmeticos p2

        //incrementoo

        int x = 5;

        // lopps -  for, while

        x++;
        x++;

        // decremento
        System.out.println(x);

        int y = 10;
        y--;
        y--;

        System.out.println(y);

        int a = 10;

        a -= 5;

        System.out.println(a);

        int b = 5;

        b += 10;

        System.out.println(b);

        //type casting

        int numero = 10;

        double numeroDouble = numero;

        System.out.println(numeroDouble);

        // explicito (narrowing)

        double numDouble = 9.53;
        int valorInt = (int )numDouble;
        System.out.println(valorInt);

        // casting de char para int


    }
}