package objetosPrincipais;

public class Usuario {
    private String nome;
    private String eMail;
    private String senha;

    public Usuario(String nome, String eMail, String senha) {
        this.nome = nome;
        this.eMail = eMail;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String geteMail() {
        return eMail;
    }

    public String getSenha() {
        return senha;
    }
}
