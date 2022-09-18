public class primalNumber {
    public static void main(String[] args) {
        int number = 20;
        boolean isNumberPrimal = true;

        if (number==1){
            isNumberPrimal=false;
        }

        for (int i = 2; i < number; i++) {
            int mod;
            mod = number % i;
            if (mod == 0) {
                isNumberPrimal = false;

            }
        }
        if (isNumberPrimal == true) {
            System.out.println("Number is primal.");
        } else {
            System.out.println("Number is not primal.");
        }
    }
}
