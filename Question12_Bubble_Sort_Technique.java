import java.util.*;
public class Question12_Bubble_Sort_Technique 

{
   public static void main(String[] args)  
      {

       Scanner sc = new Scanner(System.in);

       String[] names = new String[5];

       System.out.println("Kindly enter any 5 numbers or letters, you would like to sort: ");

       for (int i = 0; i < 5; i++)  

       {

           names[i] = sc.nextLine();

       }
       for (int i = 0; i < names.length - 1; i++)

       {
           for (int j = 0; j < names.length - i - 1; j++)

           {
               if (names[j].compareTo(names[j + 1]) > 0)  

               {

                   String temp = names[j];

                   names[j] = names[j + 1];

                   names[j + 1] = temp;

               }
           }
       }
       System.out.println("Sorted numbers/letters: ");
       for (int i = 0; i < names.length; i++)  

       {

           System.out.println(names[i]);

       }
   }
}
