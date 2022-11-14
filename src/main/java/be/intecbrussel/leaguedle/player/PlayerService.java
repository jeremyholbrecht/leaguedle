package be.intecbrussel.leaguedle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    // return list of all players
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
