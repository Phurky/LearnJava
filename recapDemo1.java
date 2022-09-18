public class recapDemo1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 100;
        int number3 = 19;

        int largestNumber = number1;

        if(number2>number1){
            largestNumber = number2;

            if (number3>number2){
                largestNumber = number3;
            }
        }

        System.out.println("largest number is : " + largestNumber);



    }
}

