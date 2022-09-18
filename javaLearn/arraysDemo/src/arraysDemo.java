public class arraysDemo {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Burak";
        students[1] = "Ceren";
        students[2] = "Kadir";
        students[3] = "İsmail";

        for(int i =0; i< students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("---------------");

        for(String student:students){
            System.out.println(student);
        }
    }
}
