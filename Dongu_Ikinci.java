import java.util.Scanner;
public class Java_Ikinci {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lütfen bir sayı giriniz.");
            a = input.nextInt();
            if (a % 4 == 0) {
                System.out.println(a + " sayısı çift ve 4 e tam bölünür.");
            }
        }
        while (a % 2 == 0);
    }
}
