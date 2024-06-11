package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Equipamento implements Serializable {

//  atributos
@Id
String ativo;//patrimonio
String nome;
String categoria;
String status;


}