import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class logdata {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(
                List.of("Igor","Rodolfo","Iago","Vitoria","Cindy","Matheus")
        );

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        String formattedDate = dateFormat.format(currentDate);

        String logMessage = "Aplicação iniciada em: " + formattedDate;
        System.out.println(logMessage);

        System.out.println("Qual usuário quer buscar? ");
        String busca = ler.nextLine();
        if(nomes.contains(busca)){
            currentDate = new Date();
            formattedDate = dateFormat.format(currentDate);
            System.out.println("""
                    Usuário encontrado.
                    Pesquisa de usuário feita em: %s""".formatted(formattedDate));
        }else {
            currentDate = new Date();
            formattedDate = dateFormat.format(currentDate);
            System.out.println("""
                    Usuário não encontrado.
                    Pesquisa de usuário feita em: %s""".formatted(formattedDate));
        }

        currentDate = new Date();
        formattedDate = dateFormat.format(currentDate);
        logMessage = "Aplicação Finalizada: " + formattedDate;
        System.out.println(logMessage);
        
    }
}
