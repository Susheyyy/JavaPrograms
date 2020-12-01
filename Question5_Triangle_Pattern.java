import java.io.*;

class Question5_Triangle_Pattern
{
    public static void main(String args[])
    throws IOException{
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("1. Ascending Triangular pattern");
        System.out.println("2. Descending Triangular pattern");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
            // Program for Ascending Triangular pattern
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            break;
            
            case 2:
            // Program for Descending Triangular pattern
            for(int i=1;i<=5;i++)
            {
                int printval = 5;
                for(int j=5;j>=i;j--)
                {
                    System.out.print(printval+" ");
                }
                System.out.println();
            }
            break;
            
            default:
            System.out.println("Invalid input - Please enter choice as 1 or 2");
        }
    }
} 

