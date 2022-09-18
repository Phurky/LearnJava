public class arkadasSayilar {
    public static void main(String[] args) {
        int sayi1 = 1184;
        int sayi2 = 1210;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            int mod;
            mod = sayi1 % i;
            if (mod == 0) {
                toplam1 = toplam1 + i;
            }

        }

        for (int j = 1; j < sayi2; j++) {
            int mod2;
            mod2 = sayi2 % j;
            if (mod2 == 0) {
                toplam2 = toplam2 + j;
            }

        }
        if (toplam1 == sayi2 || toplam2 == sayi1) {
            System.out.println("Arkadaþ sayýlar.");
        } else {
            System.out.println("Arkadaþ sayý deðiller.");
        }
    }
}
