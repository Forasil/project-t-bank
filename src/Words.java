import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Words implements WordsInterface {
    List wordlist = new ArrayList<String>(Arrays.asList("каракатица", "осьминог", "рыба", "головастик", "сладкийпирожок"));
    @Override
    public String randomWord(wordlist) {
        Random random = new Random();
        int index = random.nextInt(wordlist.size());
        String word = wordlist.get(index);
        return word;
    }
}
