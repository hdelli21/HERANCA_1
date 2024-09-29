public class Pessoa {

    public String Nome;
    public String email;
    public String Endereço;

    public Pessoa() {
    }

    public Pessoa(String Nome, String email, String Endereço) {

        this.Endereço = Endereço;
        this.Nome = Nome;
        this.email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
       this. Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }
}