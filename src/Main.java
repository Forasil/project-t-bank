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
        System.out.println(player1.getPlayerName());
        System.out.println(player1.getClife());
//        while (clife != 0) {
//
//        }
    }
}