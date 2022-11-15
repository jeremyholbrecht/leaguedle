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

    @GetMapping("/player/{id}")
    public String playerById(Model model, @PathVariable Long id){
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player";
    }

    @GetMapping("/highscores")
    public String playerHighScores(Model model){
        model.addAttribute("highscores", playerService.orderByHighScore());
        return "highscores";
    }



}
