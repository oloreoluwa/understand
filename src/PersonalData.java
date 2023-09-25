import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your date of birth (dd/mm/yyyy): ");
            String dob = scanner.next();

            scanner.nextLine();

            System.out.print("Enter your address: ");
            String address = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Person's Data:");
            System.out.println("\nName: " + name);
            System.out.println("Age: " + age);
            System.out.println("Date of birth: " + dob);
            System.out.println("Address: " + address);
            System.out.println("Phone number: " + phoneNumber);
        }
    }
}
