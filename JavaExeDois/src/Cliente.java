public class Cliente { 
    private String nome, email;
    private int idade, senha;
    private char sexo;
    public static void main(String[] args) {
        Cliente c = new Cliente("Sandy","sandy@gmail.com.br",22, 123444,'F');
        c.imprimeInformacoes();
    }
    public Cliente(String nome,String email, int idade, int senha, char sexo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
        this.sexo = sexo;
    }
    public String getNome(String nome) {
        return nome;
    }
    public String getEmail(String email) {
        return email;
    }
    public int getIdade(int idade) {
        return idade;
    }
    public int getSenha(int senha) {
        return senha;
    }
    public char getSexo(char sexo) {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void imprimeInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Sexo: " + sexo);
       

    }
}
