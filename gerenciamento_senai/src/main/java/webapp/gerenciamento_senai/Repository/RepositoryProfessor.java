package webapp.gerenciamento_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.gerenciamento_senai.Model.Professor;

public interface RepositoryProfessor extends CrudRepository<Professor, String>{
    boolean existsByCpf(String cpf);
}
