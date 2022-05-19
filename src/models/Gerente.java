package models;

public class Gerente extends FuncionarioPJ implements CalcularBonificacao {

    private Double valorBonificacao;


    @Override
    public String toString() {
        return "models.Gerente{" +
                "nome='" + super.getNome() + '\'' +
                " - documento='" + super.getDocumento() + '\'' +
                " - endereco=" + super.getEndereco().getRua() +
                " - horasTrabalhadas=" + super.getHorasTrabalhadas() +
                " - valorHora=" + super.getValorHora() +
                " - valorRemuneracao=" + super.getValorRemuneracao() +
                " - valorBonificacao=" + this.valorBonificacao +
                '}';
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorRemuneracao() * (porcentagemBonificacao/100) + 100d;
    }
}
