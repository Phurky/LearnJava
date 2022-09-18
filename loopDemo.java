public class loopDemo {
    public static void main(String[] args) {
        int i;
    //for loop
        for(i=1;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("end of for loop");

        i=1;
        while(i<50){
            System.out.println(i);
            i++;
        }
        System.out.println("end of while loop");

        int j = 100;
        do{
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("end of Do-While loop");

    }
}
