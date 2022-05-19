package models;

public class OperadorCaixa extends FuncionarioCLT {

    public OperadorCaixa() {
    }

    public OperadorCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "models.OperadorCaixa{" +
                "nome='" + nome + '\'' +
                " - documento='" + documento + '\'' +
                " - valorSalario=" + valorSalario +
                " - endereco=" + endereco.getRua() +
                '}';
    }
}
