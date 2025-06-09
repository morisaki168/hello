import java.util.Scanner;
import java.util.Random;
public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        System.out.println("数当てゲーム：1〜100の中で正解を当ててください！");
        while (true) {
            System.out.print("あなたの予想：");
            guess = scanner.nextInt();
            if (guess < answer) {
                System.out.println("もっと大きいです");
            } else if (guess > answer) {
                System.out.println("もっと小さいです");
            } else {
                System.out.println("正解！");
                break;
            }
        }
        scanner.close();
    }
}