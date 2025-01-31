import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double sonuc = sayi1 + sayi2;

        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }
    System.out.print("İşlem seç (+ veya -): ");
    char islem = scanner.next().charAt(0);

    if (islem == '+') {
        sonuc = sayi1 + sayi2;
    } else if (islem == '-') {
        sonuc = sayi1 - sayi2;
    } else {
        System.out.println("Hata: Geçersiz işlem!");
    }
}
    else if (islem == '*') {
    sonuc = sayi1 * sayi2;
}


}
