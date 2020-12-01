import java.util.Scanner;
public class Question15_Last_Digit
{
    int [] AW ;
    int temp;
    Question15_Last_Digit(int arraysize)
    {
        AW=new int[arraysize];
    }    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 8 numbers of your choice");
        for(int i=0;i<=AW.length-1;i++)
        {
            AW[i]=sc.nextInt();
        }
    }
    void Calculate()
    {
        for(int j=0;j<=AW.length-1;j++)
        {
            temp=AW[j]%10;
            if(temp==3) 
            {
                System.out.println(AW[j]);
            }                
        }
    }    
    public static void main()
    {
        Question15_Last_Digit obj=new Question15_Last_Digit(8);
        obj.input();
        obj.Calculate();       
    }
}