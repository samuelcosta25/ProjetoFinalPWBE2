package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Usuario;

public interface RepositoryUser extends CrudRepository<Usuario, Integer> {
    
    boolean existsBySenha(String senha);
    boolean existsByEmail(String email);
}
