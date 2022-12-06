package be.intecbrussel.leaguedle.champion;


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
    public Champion randomChampion(){
        List<Champion> champions = championRepository.findAll();
        Random random = new Random();
        int position = random.nextInt(champions.size());
        return champions.get(position);
    }



}
