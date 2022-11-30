package be.intecbrussel.leaguedle.champion;

import be.intecbrussel.leaguedle.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChampionService {

    private ChampionRepository championRepository;

    @Autowired
    public ChampionService(ChampionRepository championRepository){
        this.championRepository = championRepository;
    }

    // return list of all champions
    public List<Champion> getAllChampions(){
        return championRepository.findAll();
    }

    // return champion by id if nothing is found return null
    public Champion getChampionById(Long championId){
        return championRepository.findById(championId).orElse(null);
    }
}
