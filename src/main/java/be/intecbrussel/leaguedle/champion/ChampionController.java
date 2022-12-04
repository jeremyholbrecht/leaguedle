package be.intecbrussel.leaguedle.champion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChampionController {

    private ChampionService championService;

    @Autowired
    public ChampionController(ChampionService championService){
        this.championService = championService;
    }

    @GetMapping("/classic")
    public String randomChampion(Model model){
        model.addAttribute("classic", championService.randomChampion());
        return "classic";
    }



    @GetMapping("/champion")
    public String getAllChampions(Model model){
        model.addAttribute("champion", championService.getAllChampions());
        return "champion";
    }

    @GetMapping("/champion/{id}")
    public String championById(Model model, @PathVariable Long id){
        model.addAttribute("champion", championService.getChampionById(id));
        return "champion";
    }
}
