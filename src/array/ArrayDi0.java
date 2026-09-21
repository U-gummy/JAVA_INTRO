package array;

public class ArrayDi0 {
    public static void main(String[] args) {

//        int[][] students = new int[2][3];
//        students[0][0] = 1;
//        students[0][1] = 2;
//        students[0][2] = 3;
//        students[1][0] = 4;
//        students[1][1] = 5;
//        students[1][2] = 6;


        int[][] students = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }
    }

}
