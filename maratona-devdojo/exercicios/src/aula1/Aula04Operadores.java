package maratona.devdojo;

public class Aula04Operadores {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 40;
        double resultado = numero1 / (double )numero2;

        System.out.println(resultado);

        // %

        int resto = 20 % 2;
        System.out.println(resto);


        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez" +isDezDiferenteDez);

        // And(&&) - Or (||)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;


        System.out.println("isDentroDaLeiMaiorQueTrinta" +isDentroDaLeiMaiorQueTrinta );
        System.out.println("isDentroDaLeiMenorQueTrinta" +isDentroDaLeiMenorQueTrinta);


    }

}
