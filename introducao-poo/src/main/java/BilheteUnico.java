public class BilheteUnico {

    // Atributos = Caracteristicas do Objeto
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qntdVezesUsada;

    // Métodos = Comportamentos
    void carregar(Double valorRecarga){
        if(valorRecarga > 0.0) {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada");
        }else{
            System.out.println("valor invalido");
        }
    }

    boolean usar(){
        if(saldo >= 5.0) {
            saldo -= 5.0;
            qntdVezesUsada++;
            return true;
        }else {
            return false;
        }
    }
}
