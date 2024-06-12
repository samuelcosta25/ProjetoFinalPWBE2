package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Administrador;

public interface AdministradorRepository extends CrudRepository<Administrador, String>{
    
}
