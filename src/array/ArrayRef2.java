package array;

public class ArrayRef2 {
    public static void main(String[] args) {
//        int[] students;
//        students = new int[5];

        int[] students = new int[]{0, 10, 20, 30, 40};

        students[0] = 0;
        students[1] = 10;
        students[2] = 20;
        students[3] = 30;
        students[4] = 40;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
