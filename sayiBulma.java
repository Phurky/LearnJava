public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,5,7,9};
        int bul=11;
        boolean buldunMu = false;

        for (int i=0;i<sayilar.length; i++){
            if (bul==sayilar[i]){
                System.out.println("Say�y� buldunuz.Say� dizisi numaras�: "+i);
                buldunMu=true;
            }
        }
        if (buldunMu == false){
            System.out.println("Say� dizide yok.");
        }

    }
}
