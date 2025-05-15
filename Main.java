public class Main {
    public static void main(String[] args) {

    // conta 1
    ContaBancaria c1 = new ContaBancaria(1001, "Emilly", 100000.0);

    System.out.println("Saldo inicial (c1): " + c1.getSaldo());

    c1.depositar(1500.0);
    System.out.println("Após depósito de R$1500: " + c1.getSaldo());

    boolean ok = c1.sacar(500.0);
    System.out.println("Tentativa de saque de R$500: " + (ok ? "Sucesso" :
   "Falha"));

    System.out.println("Saldo final (c1): " + c1.getSaldo());

    System.out.println("---------------");

    // conta 2 
    ContaBancaria c2 = new ContaBancaria(1002, "Montanha", 500.0);

    System.out.println("Saldo inicial (c2): " + c2.getSaldo());

    c2.depositar(100.0);
    System.out.println("Após depósito de R$100: " + c2.getSaldo());

    boolean notOk = c2.sacar(700.0);
    System.out.println("Tentativa de saque de R$700: " + (notOk ? "Sucesso" :
   "Falha"));
   
    System.out.println("Saldo final (c2): " + c2.getSaldo());
   
    }
   }
