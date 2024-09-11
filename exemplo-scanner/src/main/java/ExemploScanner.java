import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerNl = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario = lerNl.nextLine();

        System.out.println("Digite a sua idade:");
        Integer idade = ler.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = ler.nextDouble();
        System.out.println("""
                O nome digitado foi: %s
                A idade digitada foi: %d
                A altura digitada foi: %.2f""".formatted(nomeUsuario, idade, altura));
    }
}
