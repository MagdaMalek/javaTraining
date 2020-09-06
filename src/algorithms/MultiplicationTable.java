package algorithms;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = i * j;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
