import java.util.Scanner;

public class DesenliMetot {
    static int sayi;
    static String sayi2 = "";

    static int artansayi(int n) {
        int cikti = n + 5;
        if (n == sayi) {
            System.out.println(sayi2);
            return 0;
        } else {
            sayi2 += "," + cikti;
            artansayi(cikti);
        }
        return cikti;
    }

    static int azalansayi(int n) {
        int cikti = n - 5;
        if (cikti <= 0) {
            sayi2 += "," + cikti;
            artansayi(cikti);
        }else {
            sayi2 += "," + cikti;
            azalansayi(cikti);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();
        sayi2 += sayi;
        azalansayi(sayi);
    }


}
