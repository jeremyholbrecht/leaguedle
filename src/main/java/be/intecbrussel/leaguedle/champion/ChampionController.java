package be.intecbrussel.leaguedle.champion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ChampionController {

    private ChampionService championService;

    @Autowired
    public ChampionController(ChampionService championService){
        this.championService = championService;
    }

    @GetMapping("/champions")
    public String getAllChampions(Model model){
        model.addAttribute("champion", championService.getAllChampions());
        return "champions";
    }

    @GetMapping("/champion/{id}")
    public String championById(Model model, @PathVariable Long id){
        model.addAttribute("champion", championService.getChampionById(id));
        return "champion";
    }
}
