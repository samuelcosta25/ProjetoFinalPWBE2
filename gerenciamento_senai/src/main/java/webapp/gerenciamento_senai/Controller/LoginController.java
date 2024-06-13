package webapp.gerenciamento_senai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;

import webapp.gerenciamento_senai.Model.Administrador;
import webapp.gerenciamento_senai.Model.Professor;
import webapp.gerenciamento_senai.Repository.RepositoryAdm;
import webapp.gerenciamento_senai.Repository.RepositoryProfessor;

// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private RepositoryAdm admRepository;
    @Autowired
    private RepositoryProfessor userRepository;

    @PostMapping("logarAdmUser")
    public ModelAndView login(Administrador adm, Professor professor,   
            RedirectAttributes attributes) {

        ModelAndView mvUser = new ModelAndView("redirect:/Professor");
        ModelAndView mvAdm = new ModelAndView("redirect:/Administrador");

        boolean verificaEmailAdm = admRepository.existsByEmail(adm.getEmail());
        boolean verificaSenhaAdm = admRepository.existsBySenha(adm.getSenha());

        boolean verificaEmailUser = userRepository.existsByEmail(professor.getEmail());
        boolean verificaSenhaUser = userRepository.existsBySenha(professor.getSenha());

        try {
            // Verifica se os campos estão preenchidos corretamente
            if (professor.getEmail().isEmpty() || professor.getSenha().isEmpty()) {
                attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");
                // return new ModelAndView("redirect:login");
            } else {
                // Verifica as credenciais do usuário comum
                if (verificaEmailUser && verificaSenhaUser) {
                    return mvUser;
                } else {
                    attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");
                }
                attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");

            }
            if (adm.getEmail().isEmpty() || adm.getSenha().isEmpty()) {
                attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");
            } else {
                // Verifica as credenciais do administrador
                if (verificaEmailAdm && verificaSenhaAdm) {
                    return mvAdm;
                } else {
                    attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");
                }
                attributes.addFlashAttribute("mensagem", "Preencha os campos corretamente!!");

            }
            // Caso de falha na autenticação
            attributes.addFlashAttribute("mensagem", "Usuário ou Administrador não Encontrado");
            return new ModelAndView("redirect:/");
        } catch (Exception e) {
            System.out.println(e);
            attributes.addFlashAttribute("mensagem", "Ocorreu um erro ao processar o login.");
            return new ModelAndView("redirect:/");
        }
    }

}
