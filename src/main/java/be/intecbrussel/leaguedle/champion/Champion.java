package be.intecbrussel.leaguedle.champion;

import javax.persistence.*;

@Table(name = "champions")
@Entity
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long championId;
    private String championName;
    private String championGender;
    private String championPosition;
    private String championSpecies;
    private String championResource;
    private String championRangeType;
    private String championRegion;
    private String championQuote;
    private Integer championReleaseYear;

    public Champion(){}

    public Champion(String championName, String championGender, String championPosition, String championSpecies,
                    String championResource, String championRangeType, String championRegion, String championQuote
                    ,Integer championReleaseYear) {
        this.championName = championName;
        this.championGender = championGender;
        this.championPosition = championPosition;
        this.championSpecies = championSpecies;
        this.championResource = championResource;
        this.championRangeType = championRangeType;
        this.championRegion = championRegion;
        this.championQuote = championQuote;
        this.championReleaseYear = championReleaseYear;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getChampionGender() {
        return championGender;
    }

    public void setChampionGender(String championGender) {
        this.championGender = championGender;
    }

    public String getChampionPosition() {
        return championPosition;
    }

    public void setChampionPosition(String getChampionPosition) {
        this.championPosition = getChampionPosition;
    }

    public String getChampionSpecies() {
        return championSpecies;
    }

    public void setChampionSpecies(String championSpecies) {
        this.championSpecies = championSpecies;
    }

    public String getChampionResource() {
        return championResource;
    }

    public void setChampionResource(String championResource) {
        this.championResource = championResource;
    }

    public String getChampionRangeType() {
        return championRangeType;
    }

    public void setChampionRangeType(String championRangeType) {
        this.championRangeType = championRangeType;
    }

    public String getChampionRegion() {
        return championRegion;
    }

    public void setChampionRegion(String championRegion) {
        this.championRegion = championRegion;
    }

    public String getChampionQuote(){return championQuote;}

    public void setChampionQuote(String championQuote){this.championQuote = championQuote;}

    public Integer getChampionReleaseYear() {
        return championReleaseYear;
    }

    public void setChampionReleaseYear(Integer championReleaseYear) {
        this.championReleaseYear = championReleaseYear;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "championId=" + championId +
                ", championName='" + championName + '\'' +
                ", championGender='" + championGender + '\'' +
                ", championPosition='" + championPosition + '\'' +
                ", championSpecies='" + championSpecies + '\'' +
                ", championResource='" + championResource + '\'' +
                ", championRangeType='" + championRangeType + '\'' +
                ", championRegion='" + championRegion + '\'' +
                ", championQuote='" + championQuote + '\'' +
                ", championReleaseYear=" + championReleaseYear +
                '}';
    }
}
