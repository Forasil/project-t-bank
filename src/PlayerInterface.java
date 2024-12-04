import java.util.ArrayList;

public interface PlayerInterface {
    int changeClife();
    void exit(String keyWord);
    ArrayList<String> addKnowledge(ArrayList<String> bookKnowledge, String knowledge);
    void text(String playerName);
    ArrayList<String> lookKnowledge();
    //ArrayList<String> bookKnowledge()

}
