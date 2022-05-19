package models;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao {

    private Double valorBonificacao;

    @Override
    public String toString() {
        return "models.Vendedor{" +
                "nome='" + nome + '\'' +
                " - documento='" + documento + '\'' +
                " - valorSalario=" + valorSalario +
                " - endereco=" + endereco.getRua() +
                " - valorBonificacao=" + this.valorBonificacao +
                '}';
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
}
