package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        int[][] students = new int[2][3];

        int num = 1;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                students[i][j] = num++;
            }
        }


        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }
    }

}
