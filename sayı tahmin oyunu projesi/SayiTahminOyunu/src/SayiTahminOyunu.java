import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        int hedef = rastgele.nextInt(100) + 1;
        int tahmin, deneme = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum. Tahmin et!");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = input.nextInt();
            deneme++;

            if (tahmin < hedef) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > hedef) {
                System.out.println("Daha küçük bir sayı girin.");
            }
        } while (tahmin != hedef);

        System.out.println("🎉 Tebrikler! " + deneme + ". denemede doğru tahmin ettiniz.");
    }
}
