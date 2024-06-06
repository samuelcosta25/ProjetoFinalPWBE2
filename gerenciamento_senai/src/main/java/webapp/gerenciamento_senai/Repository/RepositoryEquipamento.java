package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Equipamento;

public interface RepositoryEquipamento extends CrudRepository<Equipamento, String> {
    
}
