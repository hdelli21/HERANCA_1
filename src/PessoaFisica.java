public class PessoaFisica extends Pessoa {
    public String Cpf;

    public PessoaFisica() {

    }

    public PessoaFisica(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

}
