package be.intecbrussel.leaguedle.player;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    @GetMapping("/signup")
    public String test(){
        return "signup";
    }
}
