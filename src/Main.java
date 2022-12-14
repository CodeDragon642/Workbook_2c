public class Main {
    public static void main(String[] args) {
        String [][] names = {
                {"Ameena", "Bobby", "Dylan"}, //first row
                {"Charles", "Hari"} //second row
        };

        for (int i = 0; i<names.length; i++){
            for (int j=0; j<names[i].length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}