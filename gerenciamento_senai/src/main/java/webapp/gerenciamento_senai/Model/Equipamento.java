package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Id;


public class Equipamento implements Serializable {

//  atributos
@Id
String patrimonio;
String nome;
String categoria;
Boolean ativo;


// métodos
public String getPatrimonio() {
    return patrimonio;
}
public void setPatrimonio(String patrimonio) {
    this.patrimonio = patrimonio;
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

public Boolean getAtivo() {
    return ativo;
}
public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
}


    
}