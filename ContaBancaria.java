public class ContaBancaria {
    // atributos privados | encapsulamento
    private int numeroConta;
    private String titular;
    private double saldo;

    // construtor
    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // getters 
    public int getNumeroConta() {
        return numeroConta;
    }

    // setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // validação do saque
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
// Dessa vez, minha indentação está LINDA e dividida na ordem pedida, obrigada
