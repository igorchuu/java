public class Exercicio1 {
    public static void main(String[] args) {
        Integer filhosDe0a3 = 2;
        Integer filhosDe4a16 = 1;
        Integer filhosDe17a18 = 1;
        Integer totalFilhos = filhosDe0a3 + filhosDe4a16 + filhosDe17a18;

        Double valorFilho0a3 = 25.12 * filhosDe0a3;
        Double valorFilho4a16 = 15.88 * filhosDe4a16;
        Double valorFilho17a18 = 12.44 * filhosDe17a18;
        Double valorFinal = valorFilho0a3 + valorFilho4a16 + valorFilho17a18;

        System.out.println("Você tem um total de "+totalFilhos+" filhos e vai receber R$"+valorFinal+" de bolsa");
    }
}
