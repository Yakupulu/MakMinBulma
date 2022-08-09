import java.util.Scanner;

// Java ile klavyeden girilen n tane sayma sayısından en büyük ve en küçük sayıları bulan
// ve bu sayıları ekrana yazan programı yazın.

public class Odev {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int max = 0, min = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kac sayi gireceginizi yaziniz:");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayiyi giriniz:");
            a = inp.nextInt();
            if (i == 1) {
                max = a;
                min = a;
            } else {
                if (a >= max) {
                    max = a;
                } else if (a <= min) {
                    min = a;
                }
            }

        }

        System.out.println("En Buyuk sayi:"+max);
        System.out.println("En kucuk sayi:"+min);


    }
}