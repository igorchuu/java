import java.util.concurrent.ThreadLocalRandom;

public class Testes {
    public static void main(String[] args) {
        ExercicioMetodos teste = new ExercicioMetodos();

        Integer aleatorio = ThreadLocalRandom.current().nextInt(0,11);
        Integer resposta = teste.avaliandoSorte(aleatorio);
        if(resposta <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(resposta <= 10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

        Integer soma = teste.exibeSomaSorteio();
        System.out.println("A soma das tentativas é: " +soma);

        teste.exibeImpares();

        aleatorio = ThreadLocalRandom.current().nextInt(0,101);
        Integer posicao = teste.posicaoSorteio(aleatorio);
        System.out.println(aleatorio);
        if(posicao.equals(-1)){
            System.out.println("O numero não foi sorteado");
        }else {
            System.out.println("O numero foi sorteado na posição " + posicao);
        }
    }
}
