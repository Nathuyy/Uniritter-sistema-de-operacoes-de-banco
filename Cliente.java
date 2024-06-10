package Aula15;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaBancaria> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

        this.contas = new ArrayList<>();
    }

    public void registrarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public String consultarInformacoes() {
        StringBuilder info = new StringBuilder();
        info.append("Nome: ").append(nome).append("\n");
        info.append("CPF: ").append(cpf).append("\n");
        info.append("Contas: ");
        for (ContaBancaria conta : contas) {
            info.append(conta.numeroConta).append(" ");
        }
        return info.toString();
    }
}
