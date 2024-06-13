package webapp.gerenciamento_senai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import webapp.gerenciamento_senai.Model.Professor;
import webapp.gerenciamento_senai.Repository.RepositoryProfessor;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroProfessor {

    @Autowired
    private RepositoryProfessor repository;

    @PostMapping("cadastrar-professor")
    public ModelAndView cadastrarProfessor(Professor professor, RedirectAttributes attributes) {
        boolean professorExists = repository.existsByCpf(professor.getCpf());
        ModelAndView mv = new ModelAndView("redirect:/"); // Redirecionar para a página de cadastro (ajuste conforme necessário)

        try {
            if (professorExists) {
                attributes.addFlashAttribute("messageError", "Este Professor já Existe !!!");
            } else {
                
                repository.save(professor);
                attributes.addFlashAttribute("message", "Professor Cadastrado com Sucesso !!!");
            }
        } catch (Exception e) {
            System.err.println(e);
            attributes.addFlashAttribute("messageError", "Erro ao cadastrar o Professor. Tente novamente.");
        }

        return mv;
    }

}
