package be.intecbrussel.leaguedle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    // return player by id if nothing is found return null
    public Player getPlayerById(Long id){
        return playerRepository.findById(id).orElse(null);
    }

    // return list of all players
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    // add player to database
    public void createPlayer(Player player){
        playerRepository.save(player);
    }

    // return list of players sorted by their high scores in descending order
    public List<Player> orderByHighScore(){
       List<Player> players = playerRepository.findAll();
       players = players.stream().sorted(Comparator.comparing(Player::getHighScore).reversed()).collect(Collectors.toList());
       return players;
    }


}
