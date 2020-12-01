public class Question9_Series2
{
    public static void main (double x)
    {
        double s = 0;
        double n = 2;
        for(int i = 2; i<=7; i++)
        {
            s = s+x/n;
            n=n+3;
            
        }
        System.out.println(s);
    }
}