package XJunit;

class Calculator {
    public int divide(int i, int j) {
        return i / j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.divide(12,6));
        System.out.println(c.multiply(4,5));
    }


}
