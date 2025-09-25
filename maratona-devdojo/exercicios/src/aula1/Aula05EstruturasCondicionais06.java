package maratona.devdojo;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        byte dia = 3;

        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }
    }
}
