package webapp.gerenciamento_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Administrador implements Serializable {

// atributos
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
String cpf;
String nome;
String email;
String senha;
String telefone;

}