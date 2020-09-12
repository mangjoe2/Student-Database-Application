package StudentDatabase;

import java.util.Scanner;

public class student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String courses = "";
    private int tuitionBalance;
    private String studentID;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student name and year
    public student(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();
        System.out.println(firstName +" " + lastName +" " + gradeYear +" " + studentID);

    }
    //Generate ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        
        this.studentID = gradeYear + "" + id;
    }
    //Enrol in courses
    public void enroll(){
        do{
            System.out.println("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance +costOfCourse;
            }else {
                System.out.println("BREAK");
                break;}
        }while(1 != 0);
        System.out.println("Enrolled In: " + courses);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);
    }
    //Pay tuition
    public void payTuition(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: &");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }
    //Show status
    public String showInfo(){

        return "Name: " + firstName+ " " + lastName +
        "\nCourses Enrolled: "+ courses + 
        "\nBalance: $" + tuitionBalance;
    }
    
}
