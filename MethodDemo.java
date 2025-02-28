public class MethodDemo {

    // Method to greet
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Main method
    public static void main(String[] args) {
        // Call the greet method
        greet();

        // Call the printMessage method
        printMessage("This is my message!");
    }
}
