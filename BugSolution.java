public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            y = 0; // or handle the exception as needed
        }
        System.out.println(y);
    }
}