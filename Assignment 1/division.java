import java.util.*;
public class division
{
	public static void main(String args[])
	{
		int numerator,denominator,div;
		Scanner sc=new Scanner(System.in);
		System.out.print("Numerator = ");
		numerator=sc.nextInt();
		System.out.print("Denominator = ");
		denominator=sc.nextInt();
		div=divide(numerator,denominator);
		System.out.println(div);
	}
	private static int divide(int num, int deno)
	{
		int quotient=0;
		int sign=0;
		if(deno==0)
		{
			System.out.println("Division not possible");
			return 9999999;
		}
		else
		{
			if((num<0 && deno<0) || (num>0 && deno>0))
			{
				sign=1;
			}
			else if((num<0 && deno>0) || (num>0 && deno<0))
			{
				sign=-1;
			}
			while(num>=deno)
			{
				num=num-deno;
				quotient++;
			}
			quotient=quotient*sign;
			return quotient;
		}
	}
}			