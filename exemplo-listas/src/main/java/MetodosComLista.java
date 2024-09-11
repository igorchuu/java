import java.util.List;

public class MetodosComLista {
    void exebirListaDeNomes(List<String> listas){
        for(int i = 0 ;i<listas.size();i++){
            System.out.println("""
                    Nome %d: %s""".formatted(i,listas.get(i)));
        }
    }

    List<Double> lerNotas(){

    }
}
