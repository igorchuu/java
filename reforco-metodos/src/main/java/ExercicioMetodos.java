import java.util.concurrent.ThreadLocalRandom;

public class ExercicioMetodos {
    Integer avaliandoSorte(Integer valor1){
        int i = 1;
        while(i!=valor1){
            i++;
        }
        return i;
    }

    Integer exibeSomaSorteio(){
        Integer aleatorio = ThreadLocalRandom.current().nextInt(0,11);
        Integer soma = 0;
        while(aleatorio!=0){
            soma += aleatorio;
            aleatorio = ThreadLocalRandom.current().nextInt(0,11);
        }
        return soma;
    }

    void exibeImpares(){
        Integer impar = 0;
        for(int i = 1; i<=90;i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    Integer posicaoSorteio(Integer numEscolhido){
        Integer numAleatorio;
        Integer posicaoSorteio = -1;
        for (int i = 1; i <= 200; i++){

            numAleatorio = ThreadLocalRandom.current().nextInt(0,101);
            System.out.println(i+"º Sorteio resultado: "+ numAleatorio);
            if(numAleatorio.equals(numEscolhido) && posicaoSorteio == -1){
                posicaoSorteio = i;
            }

        }
        return posicaoSorteio;
    }

}
