public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String numeroConta, double saldoInicial, double limite) {
        super(numeroConta, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if (valor > saldo + limite) {
            throw new Exception("Saldo insuficiente, incluindo limite");
        }
        saldo -= valor;
        extrato.add("Saque: -R$" + valor);
    }

    public double consultarLimite() {
        return limite;
    }

    public void ajustarLimite(double novoLimite) {
        this.limite = novoLimite;
    }
}

