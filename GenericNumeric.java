import java.util.Scanner;

public class GenericNumeric<T extends Number> {

    private T number;

    public GenericNumeric(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1.0 / number.doubleValue();
    }

    public double fractionalPart() {
        double value = Math.abs(number.doubleValue());
        return value - (long) value;
    }

    public static <A extends Number, B extends Number> boolean absEqual(A a, B b) {
        return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter another number: ");
        double num2 = sc.nextDouble();

        GenericNumeric<Double> n = new GenericNumeric<>(num1);

        System.out.println("Reciprocal: " + n.reciprocal());
        System.out.println("Fractional part: " + n.fractionalPart());

        System.out.println("Absolute values equal: " + 
            GenericNumeric.absEqual(num1, num2));

        sc.close();
    }
}