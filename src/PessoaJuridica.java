public class PessoaJuridica extends Pessoa {
  public  String Cnpj;

    public PessoaJuridica (){
}
    public PessoaJuridica (String Cnpj){
        this.Cnpj = Cnpj;
    }
    public String getCnpj() {
        return Cnpj;
    }
    public void setCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }
    

}
