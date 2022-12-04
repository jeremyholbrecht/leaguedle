package be.intecbrussel.leaguedle.champion;

import be.intecbrussel.leaguedle.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;
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

    // generate random champion
    public List<Champion> randomChampion(){
        List<Champion> champions = championRepository.findAll();
        Collections.shuffle(champions);
        return champions.subList(0,1);
    }

}
