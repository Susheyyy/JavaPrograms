import java.io.*;
class Question4_Bank_Deposit
{
    public static void main(String args[])
    throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.print("Enter your choice: ");
        int option = Integer.parseInt(br.readLine());
        switch(option)
        {
            case 1:
            System.out.print("Principal: ");
            double principal = Double.parseDouble(br.readLine());
            System.out.print("Rate of interest: ");
            double rate = Double.parseDouble(br.readLine());
            System.out.print("Time in years: ");
            double time= Double.parseDouble(br.readLine());
            double maturity_value = principal * Math.pow(1 + rate / 100, time);
            System.out.println("Maturity amount: " + maturity_value);
            break;
            case 2:
            System.out.print("Monthly installment: ");
            principal = Double.parseDouble(br.readLine());
            System.out.print("Rate of interest: ");
            rate= Double.parseDouble(br.readLine());
            System.out.print("Time in months: ");
            time = Double.parseDouble(br.readLine());
            maturity_value = principal * time + principal * (time * (time + 1) / 2) * (rate/ 100) * (1.0 / 12);
            System.out.println("Maturity amount: " + maturity_value);
            break;
            default:
            System.out.println("Invalid input. Kindly enter either 1 or 2.");
        }
    }
}