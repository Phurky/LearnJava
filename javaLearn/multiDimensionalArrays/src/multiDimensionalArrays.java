public class multiDimensionalArrays {
    public static void main(String[] args) {
        String cities[][] = new String[2][2];

        cities[0][0]="Ýstanbul";
        cities[0][1]="Bursa";
        cities[1][0]="Ankara";
        cities[1][1]="Edirne";

        for (int i = 0; i< cities.length;i++){
            for (int j=0; j< cities.length;j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}
