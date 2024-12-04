import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Words implements WordsInterface {
    static ArrayList<String> wordlist = new ArrayList<String>(Arrays.asList("каракатица", "осьминог", "рыба", "головастик", "сладкийпирожок", "креветка", "форель", "окунь", "кракен", "аксолотль"));

    public static String randomWord() {
        Random index = new Random();
        String word = (String) wordlist.get(index.nextInt(wordlist.size()));
        return word;
    }


    private String wordQuest;
    public Words() {
        wordQuest = randomWord();
    }

    @Override
    public void printWord(String word) {
        System.out.println(word);
    }

    public static String changeWord(String wordQuest, String letter, String wordForPlayer) {
        char letterChar = letter.charAt(0);
        for (int i=0; i<wordQuest.length(); i++) {
            if (wordQuest.contains(letter)) {
                int index = wordQuest.indexOf(letter);
                StringBuilder wordForPlayerMet = new StringBuilder(wordForPlayer);
                wordForPlayerMet.setCharAt(index, letterChar);
                wordForPlayer = wordForPlayerMet.toString();
                StringBuilder wordQuestMet = new StringBuilder(wordQuest);
                wordQuestMet.setCharAt(index, '*');
                wordQuest = wordQuestMet.toString();
            }
        }
        return wordForPlayer;
    }
}

