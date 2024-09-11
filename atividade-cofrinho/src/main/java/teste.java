public class teste {
    public static void main(String[] args) {
        Cofrinho cofre01 = new Cofrinho();
        cofre01.proposito = "Comprar Notebook";
        cofre01.saldo = 0.0;
        cofre01.quebrado = false;

        Double valorFora01 = 20.0;
        if(!cofre01.quebrado) {
            cofre01.depositar(20.0);
            valorFora01 -= 20.0;
        }else {
            System.out.println("Cofre esta quebrado");
        }
        if(!cofre01.quebrado) {
            valorFora01 += cofre01.agitar();
            System.out.println(cofre01.saldo);
            System.out.println("""
                    %.2f""".formatted(valorFora01));
        }else {
            System.out.println("Cofre esta quebrado");
        }
        valorFora01 += cofre01.quebrar();
        if(cofre01.quebrado){
            System.out.println("O cofre foi quebrado e agora seu dinheiro na mão agora é "+valorFora01);
        }else {
            System.out.println("Cofre ja esta quebrado");
        }

        System.out.println("------------------------------------------");
        Cofrinho cofre02 = new Cofrinho();
        cofre02.proposito = "Comprar Computador";
        cofre02.saldo = 0.0;
        cofre02.quebrado = false;

        Double valorMao02 = 50.0;

        cofre02.depositar(30.0);
        valorMao02 -= 30.0;
        Double agito = cofre02.agitar();
        valorMao02 += agito;
        System.out.println("""
                Voce agitou o cofre e retirou %.2f""".formatted(agito));
        System.out.println("""
                valor total na mão %.2f""".formatted(valorMao02));
        Double quebrar = cofre02.quebrar();
        valorMao02 += quebrar;
        if(cofre02.quebrado){
            System.out.println("""
                    O Cofre foi quebrado e soltou %.2f
                    Agora seu dinheiro na mão é %.2f""".formatted(quebrar,valorMao02));
        }

    }
}
