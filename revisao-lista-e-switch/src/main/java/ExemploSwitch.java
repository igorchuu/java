import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 7: ");
        Integer dia = leitor.nextInt();

        System.out.println(dia);

        String texto = switch (dia){
            case 1 -> "Domingo";
            case 2-> "Segunda";
            case 3-> "Terça";
            case 4-> "Quarta";
            case 5-> "Quinta";
            case 6-> "Sexta";
            case 7-> "Sábado";
            default-> "Numero malo";
        };

        System.out.println(texto);

    }
}
