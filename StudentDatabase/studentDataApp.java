package StudentDatabase;

import java.util.Scanner;

/**
 * Project 2
Student Database Application
Scenario: You are a Database Administrator for a university and need to
create an application to manage student enrollments and balance.

Your application should do the following:

Ask the user how many new students will be added to the database
The user should be prompted to enter the name and year for each student
The student should have a 5-digit unique ID, with the first number being their grade level
A student can enroll in the following courses:
History 101
Mathematics 101
English 101
Chemistry 101
Computer Science 101
Each course costs $600 to enroll
The student should be able to view their balance and pay the tuition
To see the status of the student, we should see their name, ID, courses enrolled, and balance
 */
public class studentDataApp{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // student stu1 = new student();
        
        // stu1.enroll();
        // stu1.payTuition();
        // System.out.println(stu1.showInfo());

        //Ask for how many new users we want to add
        System.out.println("Enter the number of new students to enroll: ");
        int numberOfStudent = in.nextInt();
        student[] student = new student[numberOfStudent];
        //Create n number of new students
        for(int i=0; i<numberOfStudent; i++){
            student[i] = new student();
            student[i].enroll();
            student[i].payTuition();
        }
        for(int i=0; i<numberOfStudent; i++){
            System.out.println(student[0].showInfo());
        }
    }
    
}