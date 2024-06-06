package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Equipamento implements Serializable {

//  atributos
@Id
String ativo;//patrimonio
String nome;
String categoria;
String status;


// métodos
public String getAtivo() {
    return ativo;
}
public void setAtivo(String ativo) {
    this.ativo = ativo;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}


    
}