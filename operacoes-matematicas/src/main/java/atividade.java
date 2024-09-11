import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer escolha = 0;
        while(escolha!=4){
        System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair""");
        escolha = ler.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.println("Digite o primeiro numero: ");
                Integer num1 = ler.nextInt();
                System.out.println("Digite o segundo numero: ");
                Integer num2 = ler.nextInt();
                Integer soma = num1 + num2;
                System.out.println("A sua soma é: " + soma);
            }
            case 2 -> {
                System.out.println("Digite o primeiro numero: ");
                Integer num1 = ler.nextInt();
                System.out.println("Digite o segundo numero: ");
                Integer num2 = ler.nextInt();
                Integer sub = num1 - num2;
                System.out.println("A sua soma é: " + sub);
            }
            case 3 -> {
                System.out.println("Digite o primeiro numero: ");
                Integer num1 = ler.nextInt();
                System.out.println("Digite o segundo numero: ");
                Integer num2 = ler.nextInt();
                Integer multi = num1 * num2;
                System.out.println("A sua soma é: " + multi);
            }
            case 4 -> {
                System.out.println("Programa encerrado!");
            }
            default -> {
                System.out.println("Numero invalido insira outro");

            }
        }


        }
    }
}