//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Implementation of the functional interface with a lambda expression
        reverseString reverser = input -> new StringBuilder(input).reverse().toString();

        String original = "Hi mami";
        String reversed = reverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        }
    }
