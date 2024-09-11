import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {
//        List<String> frutas = new ArrayList<>();
//        frutas.add("Laranja");
//        frutas.add("Goiaba");
//        System.out.println(frutas);


        List<String> frutasMutavel = new ArrayList<>(
                List.of("Laranja","Goiaba","Limão")
        );
        frutasMutavel.add("Uva");

        System.out.println(frutasMutavel);

        frutasMutavel.set(2, "Melancia");
        System.out.println(frutasMutavel);

        for (int i = 0;i<frutasMutavel.size();i++){
            System.out.println(frutasMutavel.get(i));
        }
    for(String frutaDaVez : frutasMutavel){
        System.out.println(frutasMutavel);
    }
        for (int i = 0; i < frutasMutavel.size(); i++) {

        }
    }


}
