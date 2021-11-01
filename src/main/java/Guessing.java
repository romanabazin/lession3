import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        do {
            Random rand = new Random();
            int x = rand.nextInt(10);
            System.out.println("Угадай число:");
            for (int i = 1; i <= 3; i++) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if (a == x + 1) {
                    System.out.println("Угадал.");
                    break;
                } else if (a < x) {
                    System.out.println("Надо больше.");
                } else {
                    System.out.println("Надо меньше.");
                }
            }
                    System.out.println("Попробуем ещё? 1 - да, 0 - нет.");
                    Scanner exit = new Scanner(System.in);
                    int y = exit.nextInt();
                    if (y == 0) break;
        }while(true);
    }
}