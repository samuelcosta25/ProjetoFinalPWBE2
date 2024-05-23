package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Id;

/**
 * Administrador
 */
public class Administrador implements Serializable {

// atributos
@Id
int cpf;
int telefone;
String nome;
String email;
String senha;


// métodos
public int getCpf() {
    return cpf;
}
public void setCpf(int cpf) {
    this.cpf = cpf;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}

    
}