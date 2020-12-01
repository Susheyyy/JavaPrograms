import java.util.Scanner;
public class Question7_Student
{
    String name;
    int roll_number;
    int marks1,marks2,marks3,marks4,marks5; 
    
    Scanner sc = new Scanner(System.in);
    
    void Entering_Marks() 
    { 
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        
        System.out.println("Enter the roll number of the student");
        roll_number = sc.nextInt();
        
        System.out.println("Enter the marks scored in 1st subject by the student out of 100.");
        marks1= sc.nextInt();
        
        System.out.println("Enter the marks scored in 2nd subject by the student out of 100.");
        marks2 = sc.nextInt();
        
        System.out.println("Enter the marks scored in 3rd subject by the student out of 100.");
        marks3 = sc.nextInt();
        
        System.out.println("Enter the marks scored in 4th subject by the student out of 100.");
        marks4 = sc.nextInt();
        
        System.out.println("Enter the marks scored in 5th subject by the student out of 100.");
        marks5 = sc.nextInt();
     }
     
    void Allotment_Of_Subject()
    {
        double average = (marks1 + marks2 + marks3 + marks4 + marks5)/5.0;
        System.out.println("Average Marks: " + average);
        if(average>=90)
        {
            System.out.println("Science with Computers");
        }
        else if(80<=average && average<=89)
        {
            System.out.println("Science without Computers");
        }
        else if(70<=average && average<=79)
        {
            System.out.println("Commerce with Maths");
        }
        else
        {
            System.out.println("Commerce without Maths");
        }
    }
    
    void Display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_number);
        Allotment_Of_Subject();
    }
    
    public static void main()
    {
        Question7_Student obj = new Question7_Student();
        obj.Entering_Marks();
        obj.Display();
    }
    
}
