package be.intecbrussel.leaguedle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    //test
    // TODO: ask Pearl how to fix Request method 'Get' not supported"
    @PostMapping("/signup")
    public String addPlayer(Player player){
        playerService.createPlayer(player);
        return "redirect:/index";
    }

    @GetMapping("/highscores")
    public String playerHighScores(Model model){
        model.addAttribute("highscores", playerService.orderByHighScore());
        return "highscores";
    }



}
