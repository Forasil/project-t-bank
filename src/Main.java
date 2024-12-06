import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте.\nВведите ваше имя:");
        Scanner scannername = new Scanner(System.in);
        String name = scannername.nextLine();
        ArrayList<String> bookKnowledge = new ArrayList();
        Player player1 = new Player(name, 5, bookKnowledge);
        player1.text(player1.getPlayerName());
        String wordQuest1 = Words.randomWord();
        String wordForPlayer = "_".repeat(wordQuest1.length());
        while (player1.getClife() != 0) {
            Scanner scannercommand = new Scanner(System.in);
            String command = scannercommand.nextLine();
            switch (command) {
                case ("Сдаюсь"):
                    player1.exit(command);
                    break;
                case ("Посмотреть книгу знаний"):
                    System.out.println(player1.lookKnowledge());
                    break;
                case ("Попробовать спастись"):
                    System.out.println(wordForPlayer);
                    Scanner scannerletter = new Scanner(System.in);
                    String letter = scannerletter.nextLine();
                    if (bookKnowledge.contains(letter)) {
                        System.out.println("Вы уже вводили эту букву");
                        continue;
                }
                    else {
                        player1.addKnowledge(bookKnowledge, letter);
                    }
                    if (wordQuest1.contains(letter)) {
                        wordForPlayer = Words.changeWord(wordQuest1, letter, wordForPlayer);
                        System.out.println(wordForPlayer);
                        if (wordForPlayer.equals(wordQuest1)) {
                            System.out.println("Вы спаслись");
                            System.exit(0);
                        }
                    }
                    else {
                        player1.changeClife();
                        System.out.println("Количество жизней: "+player1.getClife());
                    }
                    break;
                case ("Посмотреть количество жизней"):
                    System.out.println("Количество жизней: "+player1.getClife());
                    break;
                default:
                    System.out.println("Не понимаю что вы хотите сделать. Введите одну из существующих команд");
            }
        }
        System.out.println("Вы умерли");
    }
}