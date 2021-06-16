package app.model;

public class User {
    private String  username;
    private String password;
    private String nickname;
    private int score = 0;

    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }
    public void increaseScore(int score){
        this.score+=score;
    }
    public void decreaseScore(int score){
        this.score-=score;
    }
}
