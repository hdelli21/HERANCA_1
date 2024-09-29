public class Empresa {
    public static void main(String[] args) {
        // Criando uma nova pessoa física
        PessoaFisica pf = new PessoaFisica();

        // Usando os métodos set para definir os valores
        pf.setNome("Marcos");
        pf.setEndereço("Rua Ipanema, 89");
        pf.setEmail("carlos452@gmail.com");
        pf.setCpf("457.185.245-78");

        PessoaJuridica pj = new PessoaJuridica ();
        pj.setNome("Samsung");
        pj.setCnpj("38.047.475/0001-50");
        pj.setEmail("samsungbrasil@oulook.com");
        pj.setEndereço("Rua Marcal , 78");

        Funcionario f = new Funcionario ();
        f.setNome("Raul Pedro");
        f.setCpf("447.275.680-86");
        f.setEmail("Raulpedro47@gmail.com");
        f.setEndereço("Rua SantosDumont , 245");

        // Exibindo os dados da pessoa física
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Endereço: " + pf.getEndereço()); // Corrigido: método getEndereco
        System.out.println("Email: " + pf.getEmail());

         // Exibindo os dados da pessoa Jurídica
         System.out.println("Nome: " + pj.getNome());
         System.out.println("CPF: " + pj.getCnpj());
         System.out.println("Endereço: " + pj.getEndereço()); // Corrigido: método getEndereco
         System.out.println("Email: " + pj.getEmail());

         // Exibindo os dados da pessoa Jurídica
         System.out.println("Nome: " + f.getNome());
         System.out.println("CPF: " + f.getCpf());
         System.out.println("Endereço: " + f.getEndereço()); // Corrigido: método getEndereco
         System.out.println("Email: " + f.getEmail());
    }
}
