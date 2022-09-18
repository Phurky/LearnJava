public class sesliHarfler {
    public static void main(String[] args) {
        char harf = 'o';
        boolean islemYapildiMi = false;

        switch (harf) {
            case 'a':
            case 'ý':
            case 'o':
            case 'u':
                System.out.println("Kalýn sesli.");
                islemYapildiMi = true;
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Ýnce sesli");
                islemYapildiMi = true;
                break;

        }

        if (islemYapildiMi == false) {
            System.out.println("geçersiz bir deðer girdiniz.");
        }

    }
}
