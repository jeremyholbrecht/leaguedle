package be.intecbrussel.leaguedle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    //@GetMapping("/signup")
    //public String test(){
      //  return "signup";
   // }

    @GetMapping("/players")
    public String allPlayers(Model model){
            model.addAttribute("players", playerService.getAllPlayers());
            return "players";
    }
}
