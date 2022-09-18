public class mukemmelSayi {
    public static void main(String[] args) {
        int toplam=0;
        int sayi =10;

        for (int i=1;i<sayi;i++){
            int mod = sayi%i;
            if (mod==0){
                toplam = toplam + i;
            }
        }
        if (toplam==sayi){
            System.out.println("Mükemmel sayý.");
        }else{
            System.out.println("Mükemmel sayý deðil.");
        }
    }

}
