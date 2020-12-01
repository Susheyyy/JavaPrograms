import java.util.Scanner;
public class Question11_Marks 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = scanner.nextInt();
		int[] rollNumbers = new int[n];
		String[] names = new String[n];
		int[] subject1Marks = new int[n];
		int[] subject2Marks = new int[n];
		int[] subject3Marks = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Student " + (i + 1));
			System.out.print("Enter roll number: ");
			rollNumbers[i] = scanner.nextInt();
			System.out.print("Enter name: ");
			scanner.nextLine(); // To consume the new line produced on hitting
			// enter after entering roll number
			names[i] = scanner.nextLine();
			System.out.print("Enter marks in subject 1: ");
			subject1Marks[i] = scanner.nextInt();
			System.out.print("Enter marks in subject 2: ");
			subject2Marks[i] = scanner.nextInt();
			System.out.print("Enter marks in subject 3: ");
			subject3Marks[i] = scanner.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
		System.out.println("Roll number = " + rollNumbers[i] + ", Name = " + names[i]);
		int averageMarks = (subject1Marks[i] + subject2Marks[i] + subject3Marks[i]) / 3;
		if (averageMarks >= 85 && averageMarks <= 100)
			{
				System.out.println("EXCELLENT");
			}
			else if(averageMarks >= 75 && averageMarks <= 84)
			{
				System.out.println("DISTINCTION");
			}
			else if (averageMarks >= 60 && averageMarks <= 74)
			{
				System.out.println("FIRST CLASS");
			}
			else if (averageMarks >= 40 && averageMarks <= 59)
			{
				System.out.println("PASS");
			}
			else if (averageMarks < 40)
			{
				System.out.println("POOR");
			}
		}
	}
}