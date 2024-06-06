package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario implements Serializable {
    
    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_user;
    String nome_user;
    String cpf_user;
    String email_user;
    String senha_user;
    int telefone_user;

    // methods

    public String getNome_user() {
        return nome_user;
    }
    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getCpf_user() {
        return cpf_user;
    }
    public void setCpf_user(String cpf_user) {
        this.cpf_user = cpf_user;
    }

    public String getEmail_user() {
        return email_user;
    }
    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getSenha_user() {
        return senha_user;
    }
    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }

    public int getTelefone_user() {
        return telefone_user;
    }
    public void setTelefone_user(int telefone_user) {
        this.telefone_user = telefone_user;
    }

}
