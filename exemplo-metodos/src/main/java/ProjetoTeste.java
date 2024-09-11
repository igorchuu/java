import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        String nomeUsuario = "Bob da Silva";
        MetodosUteis metodosLegais = new MetodosUteis();
        Scanner ler = new Scanner(System.in);


       metodosLegais.exibirUsuario(nomeUsuario);
        metodosLegais.exibirUsuario("Paulo");
        metodosLegais.exibirUsuario("Kaique");
        metodosLegais.exibirUsuario("Antonio");
        metodosLegais.exibirUsuario("Luan");

        System.out.println("Digite o seu nome: ");
        nomeUsuario = ler.nextLine();
        metodosLegais.exibirUsuario(nomeUsuario);
    }
}
