import java.util.Scanner;

public class Data {
    public static String collectName(Scanner scanner) {
        System.out.print("Enter Name: ");
        return scanner.nextLine();
    }

    public static int collectAge(Scanner scanner) {
        System.out.print("Enter Age: ");
        return scanner.nextInt();
    }

    public static String collectDOB(Scanner scanner) {
        System.out.print("Enter Date of Birth: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static String collectAddress(Scanner scanner) {
        System.out.print("Enter Address: ");
        return scanner.nextLine();
    }

    public static String collectPhoneNumber(Scanner scanner) {
        System.out.print("Enter Phone Number: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = collectName(scanner);
        int age = collectAge(scanner);
        String dob = collectDOB(scanner);
        String address = collectAddress(scanner);
        String phoneNumber = collectPhoneNumber(scanner);

        System.out.println("Person's Data:");
        System.out.println("Name: " + name + "\n");
        System.out.println("Age: " + age + "\n");
        System.out.println("Date of Birth: " + dob + "\n");
        System.out.println("Address: " + address + "\n");
        System.out.println("Phone Number: " + phoneNumber);


    }


}
