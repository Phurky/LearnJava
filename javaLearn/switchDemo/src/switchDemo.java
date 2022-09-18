public class switchDemo {
    public static void main(String[] args) {
        char grade = 'K';

        switch (grade) {
            case 'A':
                System.out.println("Perfect. Your grade is : " + grade);
                break;

            case 'B':
            case 'C':
                System.out.println("Nice. Your grade is : " + grade);
                break;

            case 'D':
                System.out.println("Not bad. Your grade is : " + grade);
                break;
            case 'F':
                System.out.println("You failed. Your grade is : " + grade);
                break;

            default:
                System.out.println("Invalid value.");

        }
    }
}
