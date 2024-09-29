public class Funcionario extends Pessoa {

    public String Cpf;
    public double Salario;

    public Funcionario (){
        
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Funcionario(String Cpf, double Salario) {
        this.Cpf = Cpf;
        this.Salario = Salario;
    }
}
