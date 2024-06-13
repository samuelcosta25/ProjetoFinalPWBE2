package webapp.gerenciamento_senai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.qos.logback.core.model.Model;
import webapp.gerenciamento_senai.Model.Equipamento;
import webapp.gerenciamento_senai.Repository.RepositoryEquipamento;


@Controller
public class CadastroEquipamento {
    
    @Autowired
    private RepositoryEquipamento repository;

    ModelAndView mv = new ModelAndView("redirect:/");

    @PostMapping("cadastrar-equipamento")
    public ModelAndView cadastrarEquipamento(Equipamento equipamento, RedirectAttributes attributes ) {

        boolean getAtivo = repository.existsById(equipamento.getAtivo());
         
        try {
            if (getAtivo) {                
                attributes.addFlashAttribute("messageError", "Este Equipamento já Existe !!!");
                }
                else{
                    attributes.addFlashAttribute("message", "Equipamento Cadastrado com Sucesso !!!");
                    repository.save(equipamento);
                    
                    }
                    
                    } catch (Exception e) {
                        System.out.println(e);
                        }
                    return mv;

    }

        @GetMapping("/interna-professor")    
    public String listarEquipamentos(Model model, RedirectAttributes attributes) {
        model.addAttribute("alunos", repository.findAll());
        return "interna/interna-professor";
    }

    // procurar alunos por disciplina
    @GetMapping("/pesquisarAluno")
    public String procurarPorDisciplina( @RequestParam("disciplina") String disciplina, Model model) {
        model.addAttribute("alunos", alunoRepository.findByDisciplinaContaining(disciplina));
        return "interna/interna-professor";
    }
    
    
}
