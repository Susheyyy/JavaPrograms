import java.util.Scanner;
public class Question14_Average
{
    double [] Array_num ;
    double sum=0;
    double avg;
    Question14_Average(int arraysize)
    {
        Array_num=new double[arraysize];
    }    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter any ten numbers");
        for(int i=0;i<=Array_num.length-1;i++)
        {
            Array_num[i]=sc.nextDouble();
        }
    }
    void Calculate()
    {
        for(int j=0;j<=Array_num.length-1;j++)
        {
           sum= sum+ Array_num[j] ;
        }
        avg=sum/10;
    }
    void display()
    {
        for(int j=0;j<=Array_num.length-1;j++)
        {
           if(Array_num[j]>avg)
           {
               System.out.println(Array_num[j]);
           }
        }        
    }    
    public static void main()
    {
        Question14_Average obj=new Question14_Average(10);
        obj.input();
        obj.Calculate();
        obj.display();
    }
}