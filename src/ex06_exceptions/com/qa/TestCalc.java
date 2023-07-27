package ex06_exceptions.com.qa;

public class TestCalc {
    public static void main(String[] args) {

        BadCalc bc1 = new BadCalc();

        System.out.println("Result of multiplying = "+bc1.multiply(5,5));
        System.out.println("Result of dividing = "+bc1.div(100, 25));

        try {
            System.out.println("Result div = "+bc1.div(10,0));
        } catch (ArithmeticException ae) {
            System.out.println("ERROR -> Calculation error caught");
        }
    }
}
