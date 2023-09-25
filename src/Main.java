import java.util.Scanner;
public class Main {

    public static void main(String[] lottery){
        int[] ticket = {3 , 9 , 23 , 6, 46 , 56, 69, 79, 77, 80};

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.println("Enter lottery ticket no.: ");
            int x = scanner.nextInt();

            switch (x){
                case 3:
                    System.out.println(ticket[0] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 9:
                    System.out.println(ticket[1] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 23:
                    System.out.println(ticket[2] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 6:
                    System.out.println(ticket[3] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 46:
                    System.out.println(ticket[4] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 56:
                    System.out.println(ticket[5] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 69:
                    System.out.println(ticket[6] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 79:
                    System.out.println(ticket[7] + ", Congrats, You are one of our lucky winners✨\n");
                    break;
                case 77:
                    System.out.println(ticket[8] + ", Congrats, You are one of our lucky winners✨\n");
                case 80:
                    System.out.println(ticket[9] + ", Congrats, You are one of our lucky winners✨\n");
                    break;

                default :
                    System.out.println("Sorry, Better luck next time😢.");





            }
            System.out.println("Do you have another lottery ticket no.?: " + "y/n \n");
            String yes = scanner.next();
            if(!yes.equals("y")){
            check = false;
            System.out.println("Have a nice day 🤗.");

            }



        }

    }




}
