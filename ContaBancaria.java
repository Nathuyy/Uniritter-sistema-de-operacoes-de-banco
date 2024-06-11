import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected List<String> extrato;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
        extrato.add("Saque: -R$" + valor);
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.add("Depósito: +R$" + valor);
    }

    public void transferir(double valor, ContaBancaria contaDestino) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
        contaDestino.depositar(valor);
        extrato.add("Transferência para " + contaDestino.numeroConta + ": -R$" + valor);
        contaDestino.extrato.add("Transferência recebida de " + numeroConta + ": +R$" + valor);
    }

    public void pagarConta(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
        extrato.add("Pagamento de conta: -R$" + valor);
    }

    public List<String> consultarExtrato() {
        return extrato;
    }
}
