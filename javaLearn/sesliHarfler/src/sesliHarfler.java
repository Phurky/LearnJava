public class sesliHarfler {
    public static void main(String[] args) {
        char harf = 'o';
        boolean islemYapildiMi = false;

        switch (harf) {
            case 'a':
            case '�':
            case 'o':
            case 'u':
                System.out.println("Kal�n sesli.");
                islemYapildiMi = true;
                break;
            case 'e':
            case 'i':
            case '�':
            case '�':
                System.out.println("�nce sesli");
                islemYapildiMi = true;
                break;

        }

        if (islemYapildiMi == false) {
            System.out.println("ge�ersiz bir de�er girdiniz.");
        }

    }
}
