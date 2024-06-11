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
public class Usuario implements Serializable {
    
    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id_user;
    String nome_user;
    String cpf_user;
    String email_user;
    String senha_user;
    String telefone_user;

}
