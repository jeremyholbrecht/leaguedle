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

    // randomChampion
    @GetMapping("/classic")
    public String randomChampion(Model model){
        model.addAttribute("classic", championService.randomChampion());
        return "classic";
    }


    // all champions
    @GetMapping("/champion")
    public String getAllChampions(Model model){
        model.addAttribute("champion", championService.getAllChampions());
        return "champion";
    }
    // champion by Id
    @GetMapping("/champion/{id}")
    public String championById(Model model, @PathVariable Long id){
        model.addAttribute("champion", championService.getChampionById(id));
        return "champion";
    }

    // champion quote
    @GetMapping("/quote")
    public String randomChampionQuote(Model model){
        model.addAttribute("quote", championService.randomChampion());
        return "quote";
    }
}
