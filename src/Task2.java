import java.io.IOException;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws IOException {
     String answ = "Вячеслав";
        System.out.print("Введите мужское имя:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        if (name.equals(answ)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
