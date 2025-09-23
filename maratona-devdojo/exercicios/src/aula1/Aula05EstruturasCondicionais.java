package maratona.devdojo;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a compra bebida alcólica");

        }
        if (isAutorizadoComprarBebida ==  false){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        if (idade){
            System.out.println("Fora do If");

        }
    }

