import java.util.Scanner;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static Number parseNumber(String input) {

        if (input.endsWith("f") || input.endsWith("F")) {
            return Float.parseFloat(input.substring(0, input.length() - 1));
        } else if (input.contains(".")) {
            return Double.parseDouble(input);
        } else {
            return Integer.parseInt(input);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key (name): ");
        String key = sc.nextLine();

        System.out.print("Enter value (number like 10, 9.5, -7f): ");
        String input = sc.nextLine();

        Number value = parseNumber(input);

        Pair<String, Number> pair = new Pair<>(key, value);

        System.out.println("Pair: " + pair);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        sc.close();
    }
}