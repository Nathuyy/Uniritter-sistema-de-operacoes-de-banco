public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(titular, saldo);
    }

    public double exibirSaldo() {
        return saldo;
}
}