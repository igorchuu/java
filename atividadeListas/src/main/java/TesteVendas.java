import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVendas {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>(
                List.of(2.99,5.00,2.00,10.00,24.99,6.99,1.00,2.60,14.00,12.99)
        );
        Scanner ler = new Scanner(System.in);
        relatorioMetodos metodo = new relatorioMetodos();

        Integer qntd = metodo.buscarQuantidadeVendas(precos);
        System.out.println(qntd);

        Double valorTotal = metodo.somarVendas(precos);
        System.out.println(valorTotal);

        System.out.println("Insira um preço para buscar:");
        Double busca = ler.nextDouble();
        System.out.println(metodo.buscarPreco(precos,busca));

        Double maiorPreco = metodo.buscarMaiorPreco(precos);
        System.out.println(maiorPreco);
        Double menorPreco = metodo.buscarMenorPreco(precos);
        System.out.println(menorPreco);

        System.out.println("Filtrar preço por:");
        Double filtro = ler.nextDouble();
        System.out.println(metodo.buscarPorPrecoMinimo(precos,filtro));
    }
}
