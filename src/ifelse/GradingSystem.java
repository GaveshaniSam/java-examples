package ifelse;

public class GradingSystem {
    public void checkGrade(int marks) {
        if (marks > 0 && marks < 35) {
            System.out.println("F");
        } else if (marks >= 35 && marks < 55) {
            System.out.println("S");
        } else if (marks >= 55 && marks < 65) {
            System.out.println("C");
        } else if (marks >= 65 && marks < 75) {
            System.out.println("B");
        } else if (marks >= 75) {
            System.out.println("A");
        } else {
            System.out.println("Invalid marks");
        }
    }

    public static void main(String[] args) {
        GradingSystem checker = new GradingSystem();

        checker.checkGrade(36);
        checker.checkGrade(56);
        checker.checkGrade(68);
        checker.checkGrade(80);
        checker.checkGrade(-5);
    }
}
