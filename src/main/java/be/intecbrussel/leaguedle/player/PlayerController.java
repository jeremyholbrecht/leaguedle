package be.intecbrussel.leaguedle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

   /* @GetMapping("/player")
    public String allPlayers(Model model){
            model.addAttribute("players", playerService.getAllPlayers());
            return "player";
    }
   */

    @GetMapping("/player/{id}")
    public String playerById(Model model, @PathVariable Long id){
        model.addAttribute("player", playerService.getPlayerbyId(id));
        return "player";
    }

}
