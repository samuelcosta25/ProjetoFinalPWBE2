package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Administrador;

public interface RepositoryAdm extends CrudRepository<Administrador, Integer> {
    
    boolean existsBySenha(String senha);
    boolean existsByEmail(String email);
}
