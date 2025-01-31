import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlem seç (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;
        boolean gecerliIslem = true;

        if (islem == '+') {
            sonuc = sayi1 + sayi2;
        } else if (islem == '-') {
            sonuc = sayi1 - sayi2;
        } else if (islem == '*') {
            sonuc = sayi1 * sayi2;
        } else if (islem == '/') {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Hata: Sıfıra bölme yapılamaz!");
                gecerliIslem = false;
            }
        } else {
            System.out.println("Hata: Geçersiz işlem seçtiniz!");
            gecerliIslem = false;
        }

        if (gecerliIslem) {
            System.out.println("Sonuç: " + sonuc);
        }

        scanner.close();
    }
}
