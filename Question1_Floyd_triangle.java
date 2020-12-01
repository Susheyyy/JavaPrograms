public class Question1_Floyd_triangle
{
   public static void printFloyd (int rows)
   {
       int number = 1;
       System.out.printf("Floyd's triangle of %d rows is : %n", rows);
       for(int i = 1;i<=rows;i++)
       {
           for ( int j =1; j<= i; j++)
           {
               System.out.print(number +" ");
               number++;
            }
           System.out.println();
        }
    }
}