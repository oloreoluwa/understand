import java.util.Scanner;
public class Even{
    public static void main(String[] odd){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter highest number: ");
            int num = scanner.nextInt();

            System.out.println("Even number from 1 to " + num + ":");
            for(int x = 2; x <= num; x += 2) {
                System.out.println(x);
            }
        }
    }
}
