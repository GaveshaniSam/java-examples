package ifelse;

public class OddEvenChecker {
    public void findOddEven(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void main(String[] args) {
        OddEvenChecker checker = new OddEvenChecker();

        checker.findOddEven(1);
        checker.findOddEven(2);
        checker.findOddEven(0);
    }
}
