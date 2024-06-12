package webapp.gerenciamento_senai.Controller.Equipamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webapp.gerenciamento_senai.Model.Equipamento;
import webapp.gerenciamento_senai.Repository.EquipamentoRepository;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    

    @Autowired
    private EquipamentoRepository repository;

    @GetMapping
    public List<Equipamento> getAllEquipamentos(){
        return (List<Equipamento>) repository.findAll();
    }

    @PostMapping
    public Equipamento createEquipamento(@RequestBody Equipamento equipamentos){
        return repository.save(equipamentos);
    }
}
