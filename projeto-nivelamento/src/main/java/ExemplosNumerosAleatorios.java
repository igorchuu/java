import java.util.concurrent.ThreadLocalRandom;

public class ExemplosNumerosAleatorios {
    public static void main(String[] args) {
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,11);
        System.out.println("Inteiro sorteado: " + inteiroAleatorio);
    }

}
