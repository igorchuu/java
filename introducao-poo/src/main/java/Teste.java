public class Teste {
    public static void main(String[] args) {
        //Instanciar objeto
        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Bob";
        bilhete01.saldo = 0.0;
        bilhete01.qntdVezesUsada = 0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Jose";
        bilhete02.saldo = 0.0;
        bilhete02.qntdVezesUsada = 0;
        bilhete02.codigo = "B002";

        bilhete01.carregar(42.1);
        System.out.println(bilhete01.saldo);
        Boolean deuCerto = bilhete02.usar();
        System.out.println(deuCerto);

    }
}
