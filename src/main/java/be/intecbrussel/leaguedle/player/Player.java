package be.intecbrussel.leaguedle.player;

import javax.persistence.*;

@Table(name = "players")
@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Integer gamesWon;
    private Integer averageGuesses;

    public Player(String userName, String password, String email, Integer gamesWon, Integer averageGuesses) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gamesWon = gamesWon;
        this.averageGuesses = averageGuesses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(Integer gamesWon) {
        this.gamesWon = gamesWon;
    }

    public Integer getAverageGuesses() {
        return averageGuesses;
    }

    public void setAverageGuesses(Integer averageGuesses) {
        this.averageGuesses = averageGuesses;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gamesWon=" + gamesWon +
                ", averageGuesses=" + averageGuesses +
                '}';
    }
}
