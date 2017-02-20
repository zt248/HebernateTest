package lesson15_hibernate.controller;

import lesson15_hibernate.model.Predmet;
import lesson15_hibernate.service.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/predmet")
public class PredmetController {

    private PredmetService predmetService;

    @Autowired
    public void setPredmetService(PredmetService predmetService) {
        this.predmetService = predmetService;
    }

    /*Отображение всех предметов*/

    @RequestMapping(value = "getAllPredmet", method = RequestMethod.GET)
    public String getAllPredmet (Model model){
        model.addAttribute("predmet", new Predmet());
        model.addAttribute("predmetList", predmetService.getAllPredmet());
        return "predmet/allPredmets";
    }

    /*Добавление нового предмета*/
    @RequestMapping(value = "addPredmet")
    public String addPredmet (Predmet predmet, Model model){
        predmetService.create(predmet);
        return "redirect:/predmet/getAllPredmet";
    }


    /*Чтение предемена по Id*/
    @RequestMapping(value = "readPredmetById/{id}")
    public String readPredmetById (@PathVariable("id")Integer id, Model model){
        model.addAttribute("predmet", predmetService.read(id));
        return "predmet/predmetById";
    }

    /*Обновление предмена*/
    @RequestMapping(value = "update/{id}")
    public String upPr(@PathVariable("id") Integer id, Model model){
        model.addAttribute("command", predmetService.read(id));
        return "/predmet/updatePredmet";
    }

    @RequestMapping(value = "updatePredmet", method = RequestMethod.POST)
    public String updatePredmet(Model model, Predmet predmet){
        predmetService.update(predmet);
        return "redirect:/predmet/getAllPredmet";
    }

    /*Удаление предмета по Id*/
    @RequestMapping(value = "detelePredmetById/{id}")
    public String detelePredmetById (@PathVariable("id") Integer id){
        predmetService.delete(id);
        return "redirect:/predmet/getAllPredmet";
    }



    /*Переход ко всем Предметам*/
    @RequestMapping(value = "redir", method = RequestMethod.GET)
    public String redir(){
        return "redirect:/predmet/getAllPredmet";
    }




}
