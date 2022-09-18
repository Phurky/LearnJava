public class recapDemo2 {
    public static void main(String[] args) {
        double[] myList = {3.14, 4.2, 5.3};
        double max = myList[0];
        double total = 0;
        for (double number : myList) {
            System.out.println(number);
            if (number > max) {
                max = number;
            }
            total = number + total;
        }
        System.out.println("total: " + total);
        System.out.println("greatest number : " + max);
    }
}
