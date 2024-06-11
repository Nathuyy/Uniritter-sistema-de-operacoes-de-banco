public class SistemaBancario {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        //cria a conta
        ContaCorrente conta1 = new ContaCorrente(0, "Pessoa1", 0, 0);
        ContaPoupanca conta2 = new ContaPoupanca(0, "Pessoa2", 0);

        //add a conta no banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        //Operações
        conta1.depositar(0);
        conta1.sacar(0);
        conta1.exibirSaldo();

        conta2.depositar(0);
        conta2.sacar(0);
        conta2.exibirSaldo();

        //Pixzinho
        banco.transferenciaPix(0, 0, 0);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
