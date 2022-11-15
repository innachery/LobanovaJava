import java.io.IOException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите любое число:");
        Scanner inputNum = new Scanner(System.in);
        int i = inputNum.nextInt();
        if (i > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Попробуй еще раз");
        }

    }
}