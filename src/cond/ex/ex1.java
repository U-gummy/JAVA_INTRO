package cond.ex;

public class ex1 {
    public static void main(String[] args) {
        int score = 10;
        String grade = "";

        if (score >= 90) {
            grade = "A";
            System.out.println("학점은" + grade);
        } else if (score >= 80) {
            grade = "B";
            System.out.println("학점은" + grade);
        } else if (score >= 60) {
            grade = "C";
            System.out.println("학점은" + grade);
        } else {
            grade = "E";
            System.out.println("학점은" + grade);
        }


    }
}
