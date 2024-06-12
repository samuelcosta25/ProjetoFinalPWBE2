package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
}
