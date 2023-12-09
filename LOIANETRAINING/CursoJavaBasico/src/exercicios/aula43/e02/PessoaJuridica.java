package exercicios.aula43.e02;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    // Calc 10% de imposto
    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
        //return (this.getRendaBruta() / 100) * 10;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "imposto a ser pago= '" + calcularImposto() + '\'' +
                "} " + super.toString();
    }
}
