public class intro {
    public static void main(String[] args) {

        String girisMetni = "hosgeldin hocam";
        String kapanisMetni = "gorusuruz hocam";

        double btcB = 11;
        double btcD = 13.1;

        boolean btcDustuMu = false;
        String durum = "" ;

        System.out.println(girisMetni);

        if (btcB<btcD) {

            durum = "dusmus";
            System.out.println(durum);
        } else if (btcB>btcB){
            durum="artmis";
            System.out.println(durum);
        }
        else {
            durum="sabit";
            System.out.println(durum);
        }

        System.out.println(kapanisMetni);



    }
}