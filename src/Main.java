import models.Endereco;
import models.Gerente;
import models.OperadorCaixa;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {

/*        models.Endereco endereco = new models.Endereco();
        endereco.setRua("Rua 1");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua 1, 10", "Casa B", "Bairro 1");
        System.out.println(endereco);
        Endereco endereco2 = new Endereco("Rua 2, 20", "", "Bairro 2");
        System.out.println(endereco2);
        Endereco endereco3 = new Endereco("Rua 3, 30", "Apt 55, Andar 7", "Bairro 1");
        System.out.println(endereco3);


        Vendedor vendedor = new Vendedor();
        vendedor.setNome("João");
        vendedor.setDocumento("123.456.789-10");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);

        vendedor.calcularBonificacao(10d);

        System.out.println("\n" + vendedor);


        OperadorCaixa operadorCaixa = new OperadorCaixa("Lucas", "101.112.131-41", 1200d, endereco2);
        System.out.println("\n" + operadorCaixa);


        Gerente gerente = new Gerente();
        gerente.setNome("Roberto");
        gerente.setDocumento("151.436.779-11");
        gerente.setEndereco(endereco3);
        gerente.setHorasTrabalhadas(160);
        gerente.setValorHora(10d);

        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(5d);

        System.out.println("\n" + gerente);

    }
}