package webapp.gerenciamento_senai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import webapp.gerenciamento_senai.Model.Equipamento;
import webapp.gerenciamento_senai.Repository.RepositoryEquipamento;


@Controller
public class CadastroEquipamento {
    
    @Autowired
    private RepositoryEquipamento repository;

    ModelAndView mv = new ModelAndView();

    @PostMapping("cadastrar-equipamento")
    public void cadastrarEquipamento(Equipamento equipamento, RedirectAttributes attributes ) {

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

    }
    
}
