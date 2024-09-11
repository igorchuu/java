import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        MetodosComLista metodos = new MetodosComLista();

        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(42);

        System.out.println(listaEstranha);

        List<String> nomes = new ArrayList();
        nomes.add("Bob da Silva");
        nomes.add("José");
        nomes.add("Maria");

        System.out.println("Segundo nome da lista: "+nomes.get(1));

        //for(int i = 0 ;i<nomes.size();i++){
            //System.out.println("""
                    //Nome %d: %s""".formatted(i,nomes.get(i)));

            // if(nomes.get(i).equals("José")){
            //    nomes.remove(i);
            //    System.out.println("removeu o jose");
            //}
        //}

        metodos.exebirListaDeNomes(nomes);

        //principais metodos
        // add nomes.add("Igor");
        // size nomes.size;
        // get nomes.get(1);
        // set nomes.set(1, "Xampson");
        // remove nomes.remove(2);
        // isEmpty retorna true se a lista tiver vazia
        // clear limpa a lista
        //
    }
}
