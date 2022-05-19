package models;

public abstract class FuncionarioPJ {

    private String nome, documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora, valorRemuneracao;

    public void calcularRemuneracao(){
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    @Override
    public String toString() {
        return "models.FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                " - documento='" + documento + '\'' +
                " - endereco=" + endereco +
                " - horasTrabalhadas=" + horasTrabalhadas +
                " - valorHora=" + valorHora +
                " - valorRemuneracao=" + valorRemuneracao +
                '}';
    }
}
