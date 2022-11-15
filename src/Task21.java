import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task21 {
    public static void main (String[] args) throws IOException {
        String answ = "Вячеслав";
        System.out.print("Введите мужское имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        if(n.equals(answ)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
