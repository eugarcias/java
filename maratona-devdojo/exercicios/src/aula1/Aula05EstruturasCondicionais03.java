package maratona.devdojo;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Mauricio";
        String mensagemNaoDoar = "Ainda não tenho condições, mas terei um dia!";

        //(condicaio) ? verdadeiro : falso
        String resultado = salario > 6000  ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
