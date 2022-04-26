package classes;

public class TesteConta {
  public static void main(String[] args) {
    Conta contaCorrente = new Conta();
    Conta contaPoupanca = new Conta();
    Conta contaInvestimento = new Conta();

    contaCorrente.numero = 11;
    contaCorrente.saldo = 20.5;
    contaCorrente.cliente.nome = "Leandro";
    contaCorrente.cliente.idade = 36;

    contaPoupanca.numero = 22;
    contaPoupanca.saldo = 30;
    contaPoupanca.cliente.nome = "Fulano";
    contaPoupanca.cliente.idade = "40";

    contaInvestimento.numero = 33;
    contaInvestimento.saldo = 40;
    contaInvestimento.cliente.nome = "Teste";
    contaInvestimento.cliente.idade = "49";

    System.out.println(contaCorrente.numero);
    System.out.println(contaCorrente.saldo);
    System.out.println(contaCorrente.cliente.nome);
  }
}
