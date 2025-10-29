//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        // 1 - Boolean é true ou false
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isFalse);

        // - Operadores de Comparação

        int x = 10;

        System.out.println(x == 10);
        System.out.println(x != 9);
        System.out.println(x != 5);
        System.out.println(x < 10);
        System.out.println(x > 5);

        // Atribuição X Comparação

        int n = 5; // Atribuição
        int m = 10;

        System.out.println(n == 12); // Comparação

        // Comparação de Strings

        String str = "Java";
        String str1 = new String("Java");

        System.out.println(str == str1);
        System.out.println(str == "Java");
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // Estrutura de Condição

        int numero = 10;
        if (numero > 100) {
            System.out.println("Número é maior que 5!");
        } else {
            System.out.println("O número não é maior que 100!");

        }
        String texto = "texto";
        if (texto.equalsIgnoreCase("Texto")) {
            System.out.println("O Texto é texto!");
        }


    double nota = 10;

    if (nota == 10){
    System.out.println("Você tirou a nota máxima");
    }
    else if (nota >=9) {
        System.out.println("Nota muito boa!");
    } else if (nota >= 7){
        System.out.println("Nota média!");
    } else {
        System.out.println("Nota abaixo da média!");
    }

    // Operadores Lógicos
        // && (And) Retorna True se ambas condiçoes forem verdadeiras
        // || Retorna true se pelo menos uma condição for verdadeira
        // ! Inverto valor lógico, retornma true se a condição for false e vice-versa




  }
}