import java.util.Scanner;

public class Object {

    public static void main(String[] polygon) {
        String[] shapes = {"Pentagon", "Hexagon", "Heptagon", "Octagon", "Nonagon"};

        Scanner scanner = new Scanner(System.in);
            boolean check = true;
            while(check) {
                System.out.println("These are polygon 5-9 " + "Please, Enter any number to coutinue");
                int z = scanner.nextInt();
                String yes="";
                for(int x = 0; x < z; x++) {
                    System.out.println("Enter sides: ");
                    int y = scanner.nextInt();

                    switch (y) {
                        case 5:
                            System.out.println(shapes[0]);
                            break;
                        case 6:
                            System.out.println(shapes[1]);
                            break;
                        case 7:
                            System.out.println(shapes[2]);
                            break;
                        case 8:
                            System.out.println(shapes[3]);
                            break;
                        case 9:
                            System.out.println(shapes[4]);
                            break;

                        default:
                            System.out.println("Sorry, enter the polygons sides from 5-9");
                            break;
                    }

                    System.out.println("Do you want to enter another polygon side\n" + "y/n");
                    yes = scanner.next();
                    if (!yes.equals("y")) {
                        check = false;
                        break;
                    }else{
                        break;
                    }

                }
                if (yes.equalsIgnoreCase("y")) {
                    continue;
                }

                System.out.println("Have a nice day.");
            }

    }
}
