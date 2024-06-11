import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.printf("Conta %d adicionada com sucesso.\n", conta.numero);
    }

    public ContaBancaria encontrarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.numero == numero) {
                return conta;
            }
        }
        return null;
    }

    public void transferenciaPix(int numeroOrigem, int numeroDestino, double valor) throws Exception {
        ContaBancaria contaOrigem = encontrarConta(numeroOrigem);
        ContaBancaria contaDestino = encontrarConta(numeroDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}
