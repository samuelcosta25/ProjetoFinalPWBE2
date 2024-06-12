package webapp.gerenciamento_senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    

    @GetMapping("/")
    public String acessoHome() {
        return "login/login";
    }
    @GetMapping("/Administrador")
    public String pageAdm() {
        return "indexAdm";
    }
    @GetMapping("/Professor")
    public String pageUser() {
        return "indexUser";
    }
}
