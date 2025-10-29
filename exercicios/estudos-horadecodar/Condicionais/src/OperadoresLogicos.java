public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 18;
        boolean temCnh = true;

        System.out.println(idade >= 18 && temCnh);

        int a = 10;
        int b = 20;

        if (a > 5 && b > 10) {
            System.out.println("Deu certo!");

        }

        // 9 - OR - Se uma condição for falsa, será true

        boolean estarChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estarChovendo || temGuardaChuva);

        System.out.println(10 > 20 && 100 == 200);

        int idade2 = 15;
        boolean ehMembro = true;

        if (idade2 > 18 || ehMembro){
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("Não pode entrar!");
        }

        // 10 - Operador Not

        System.out.println(estarChovendo);
        System.out.println(!estarChovendo);
        System.out.println(estarChovendo || !temGuardaChuva);


    }
}
