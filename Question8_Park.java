import java.util.Scanner;
class Question8_Park
{
 double Entryfee,discount,amount;
 int age;
 void input()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Entry Fee");
 Entryfee=sc.nextDouble();
 System.out.println("Enter Age");
 age=sc.nextInt();
 }
 void calculate()
 {
 if(age<=12)
 {
 discount=(45*Entryfee)/100;
 amount=Entryfee-discount;
 }
 else if(age>=50)
 {
 discount=(50*Entryfee)/100;
 amount=Entryfee-discount;
 }
 else
 {
 discount=(10*Entryfee)/100;
 amount=Entryfee-discount;
 }
 }
 void display()
 {
 System.out.println("The total amount= Rs"+amount);
 }
 public static void main()
 {
 Question8_Park obj=new Question8_Park();
 obj.input();
 obj.calculate();
 obj.display();
 }
}

