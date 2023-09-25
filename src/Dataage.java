import java.util.Scanner;

class Dataage {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);

        //set the age via Setter


        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        //complete Getter
        return age;
    }
    public void setAge(int age){
        if(age < 0){
            System.out.println("Invalid age");
            this.age = 0;

        }
        else
            this.age = age;
    }
}