import java.util.ArrayList;

public class Player implements PlayerInterface {

    private String playerName;
    private int clife;
    private ArrayList<String> bookKnowledge;

    public Player(String playerName, int clife, ArrayList<String> bookKnowledge) {
        this.playerName = playerName;
        this.clife = clife;
        this.bookKnowledge = bookKnowledge;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getClife() {
        return clife;
    }

    @Override
    public int changeClife(int clafe) {
        clife = clife-1;
        return clife;
    }

    @Override
    public ArrayList<String> addKnowledge(ArrayList<String> bookKnowledge, String knowledge) {

        return bookKnowledge;
    }

    @Override
    public void exit(String kluchSlovo) {
        if (kluchSlovo == "Выход") {
            System.exit(0);
        }
    }

}
