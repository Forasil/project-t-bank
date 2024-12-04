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
    public int changeClife() {
        clife--;
        return clife;
    }


    @Override
    public ArrayList<String> addKnowledge(ArrayList<String> bookKnowledge, String knowledge) {
        bookKnowledge.add(knowledge);
        return bookKnowledge;
    }

    @Override
    public ArrayList<String> lookKnowledge() {
        return bookKnowledge;
    }

    @Override
    public void exit(String keyWord) {
        if (keyWord.equals("Сдаюсь")) {
            System.out.println("Вы умерли");
            System.exit(0);
        }
    }

    @Override
    public void text(String playerName) {
        System.out.println(playerName+ ", вы нарушили правило и зашли в опасную зону. За это вы приговориваетесь к казни через повешение. \nУ вас единственная возможность спастись - угадать загаданное слово. Вам даётся 5 жизней. \nСлово угадывается по одной букве. Если вы называете букву неправильно, то теряете одну жизнь. \nПо окончании жизней вы проигрываете. \nЕсли хотите сдаться раньше, напишите: 'Сдаюсь'. \nЕсли хотите попробовать угадать букву, напишите 'Попробовать спастись'. \nЕсли хотите посмотреть набор букв, которые вы вводили, но они не подошли, напишите 'Посмотреть книгу знаний'. \nЕсли хотите посмотреть количество жизней, напишите 'Посмотреть количество жизней'");
    }

}
