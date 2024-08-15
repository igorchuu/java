import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
        for(int i=0; i <= 10; i++){
            System.out.println(i);
        }
        Integer contador = 0;
        while(contador <=10){
            System.out.println(contador);
            contador++;
        }
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,6);
        System.out.println("Inteiro sorteado: " + inteiroAleatorio);
        while(inteiroAleatorio != 3){
            System.out.println("Não sorteou, sorteado: " + inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,6);
        }
        System.out.println("Sorteou o 3");
    }
}
