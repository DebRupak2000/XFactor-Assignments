import java.util.*;
class IncomeTax
{
	public static void main(String args[])
	{
		double tax=0.0,income,additional=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Income Amount :");
		income=sc.nextDouble();
		if(income<=300000)
			tax=0;
		else if(income>=300001 && income<=500000)
		{
			tax=0.1*(income-300000);
			additional=(0.02*tax)+(0.01*tax);
			tax=tax+additional;
		} 
		else if(income>=500001 && income<=1000000)
		{
			tax=20000+(0.2*(income-500000));
			additional=(0.02*tax)+(0.01*tax);
			tax=tax+additional;
		}
		else if(income>1000000)
		{
			tax=120000+(0.3*(income-1000000));
			additional=(0.02*tax)+(0.01*tax);
			tax=tax+additional;
		}
		System.out.print("Income Tax Amount is: Rs. "+tax);
	}
}