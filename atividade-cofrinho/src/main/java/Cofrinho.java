import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String proposito;
    Double saldo;
    Boolean quebrado;

    void depositar(Double valorDeposito) {
        if (!quebrado) {
            if (valorDeposito > 0) {
                saldo += valorDeposito;
                System.out.println("valor depositado " + valorDeposito);
            } else {
                System.out.println("valor invalido");
            }
        } else {
            System.out.println("Cofrinho Quebrado");
        }
    }

    Double agitar() {
        Double valorAleatorio = 0.0;
        if (!quebrado) {
            if(saldo>0) {
                valorAleatorio = ThreadLocalRandom.current().nextDouble(0, saldo);
                saldo -= valorAleatorio;
            }
        }
        return null;
    }

    Double quebrar() {
        Double valorPego = 0.0;
        if (!quebrado) {
            quebrado = true;
            valorPego = saldo;
            saldo = 0.0;
            return valorPego;
        }else{
            return null;
        }
    }
}

