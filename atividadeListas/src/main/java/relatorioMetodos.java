import java.util.ArrayList;
import java.util.List;

public class relatorioMetodos {
    Integer buscarQuantidadeVendas(List<Double> lista){
        Integer qntdValores = lista.size();

        return qntdValores;
    };
    Double somarVendas(List<Double> lista){
        Double soma = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }
        return soma;
    };
    Boolean buscarPreco(List<Double> lista , Double busca){
        if(lista.contains(busca)){
            return true;
        }
        return false;
    }
    Double buscarMaiorPreco(List<Double> lista){
        Double maiorPreco = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)>maiorPreco){
                maiorPreco = lista.get(i);
            }
        }
        return maiorPreco;
    }
    Double buscarMenorPreco(List<Double> lista){
        Double maiorPreco = 25.0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)<maiorPreco){
                maiorPreco = lista.get(i);
            }
        }
        return maiorPreco;
    }
    List<Double> buscarPorPrecoMinimo(List<Double> lista ,Double filtro){
        List<Double> filtrados = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)>=filtro){
                filtrados.add(lista.get(i));
            }
        }
        return filtrados;
    }

}
