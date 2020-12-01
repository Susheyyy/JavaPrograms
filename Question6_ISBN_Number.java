import java.util.*;
public class Question6_ISBN_Number
 { 
  public static void main()
  { 
  Scanner in=new Scanner(System.in);
  int ISBN;
  int n=0,s=0,a=0,b=10;
  System.out.println("Enter ISBN");
  ISBN=in.nextInt();
  while(ISBN>0)
  {
  a=ISBN%10;
  n++;
  s+=a*b;
  b--;
  ISBN/=10;
  }
  if(n<10||n>10||s%11!=0)
  System.out.println("Illegal ISBN");
  else if(n==10&&s%11==0)
  System.out.println("Valid ISBN");
  }
}

