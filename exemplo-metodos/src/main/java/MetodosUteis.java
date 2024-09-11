public class MetodosUteis {
    void exibirUsuario(String nome){
        System.out.println("""
                *----------------*----------------*
                Usuario logado: %s
                *----------------*----------------*""".formatted(nome));
    }

    Double somar (Double num01, Double num02){
        return num01 + num02;
    }

}
