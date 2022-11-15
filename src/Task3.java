import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int size = input.nextInt();
int[] myArray = new int[size];
System.out.print("Введите элементы массива:");
for (int i=0; i<myArray.length;i++){
    myArray[i]=input.nextInt();
}
System.out.println("Элементы массива, кратные 3:");
for (int i=0; i<myArray.length; i++){
    if (myArray[i]%3==0){
        System.out.println(myArray[i]);
    }
}
    }


}
