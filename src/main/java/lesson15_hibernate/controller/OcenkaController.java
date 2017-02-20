package lesson15_hibernate.controller;

import lesson15_hibernate.model.Ocenka;
import lesson15_hibernate.service.OcenkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ocenka")
public class OcenkaController {

    private OcenkaService ocenkaService;

    @Autowired
    public void setPredmetService(OcenkaService ocenkaService) {
        this.ocenkaService = ocenkaService;
    }


    /*Добавить оценку*/
    @RequestMapping(value = "addOcenka")
    public String addOcenka(Model model, Ocenka ocenka){
        ocenkaService.create(ocenka);
        return "redirect:/ocenka/getAllOcenka";
    }
    /*Прочесть оценку по Id*/
    @RequestMapping(value = "readOcenkaById/{id}")
    public String readOcenkaById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("ocenka", ocenkaService.read(id));
        return "/ocenka/ocenkaById";
    }
    /*Обновить оценку*/
    @RequestMapping(value = "update/{id}")
    public String upOc (@PathVariable("id") Integer id, Model model){
        model.addAttribute("ocenka", ocenkaService.read(id));
        return "ocenka/updateOcenka";
    }

    @RequestMapping(value = "updateOcenka", method = RequestMethod.POST)
    public String updateOcenka(Ocenka ocenka){
        ocenkaService.update(ocenka);
        return "redirect:/ocenka/getAllOcenka";
    }


    /*Удалить Оценку*/
    @RequestMapping(value = "deleteOcenkaById/{id}")
    public String deleteOcenkaById(@PathVariable("id") Integer id){
        ocenkaService.delete(id);
        return "redirect:/ocenka/getAllOcenka";
    }


    /*отобразить все оценки*/
    @RequestMapping(value = "getAllOcenka", method = RequestMethod.GET)
    public String getAllOcenka (Model model){
        model.addAttribute("ocenka", new Ocenka());
        model.addAttribute("ocenkaList", ocenkaService.getAllOcenka());
        return "ocenka/allOcenka";
    }

    /*возврат ко всез оценкам*/
    @RequestMapping(value = "redirect")
    public String redirect(){
        return "redirect:/ocenka/getAllOcenka";
    }

}
