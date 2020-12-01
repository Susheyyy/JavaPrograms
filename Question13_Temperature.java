import java.util.Scanner;
public class Question13_Temperature
{
    int [] Temp=new int[5];  
    void Entering_the_temperatures()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter the temperature of five different cities of your choice:");
        for(int i=0;i<=Temp.length-1;i++)
        {
            Temp[i]=sc.nextInt();
        }
    }
    void Comparing_the_temperatures()
    {
        for(int j=0;j<=Temp.length-1;j++)
        {
            int temporary;
            for(int x=0;x<=Temp.length-2;x++)
            {
                if(Temp[x]>Temp[x+1])
                {
                    temporary=Temp[x];
                    Temp[x]=Temp[x+1];
                    Temp[x+1]=temporary;
                }
            }
        }
    }
    void Final_answer()
    {
        for(int y=0;y<=Temp.length-1;y++)
        {
            System.out.print(Temp[y]+" ");
        }
    }
    public static void main()
    {
        Question13_Temperature obj=new Question13_Temperature();
        obj.Entering_the_temperatures();
        obj.Comparing_the_temperatures();
        obj.Final_answer();
    }
}