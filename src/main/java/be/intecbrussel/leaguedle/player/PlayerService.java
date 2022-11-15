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

    // return played based by id given if nothing is found return null
    public Player getPlayerbyId(Long id){
        return playerRepository.findById(id).orElse(null);
    }

    // return list of all players
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
