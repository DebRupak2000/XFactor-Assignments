import java.util.*;
import java.lang.Math;
public class analog
{
	public static void main(String args[])
	{
		int hour,minute;
		double angle;
		Scanner sc=new Scanner(System.in);
		System.out.print("Hour = ");
		hour=sc.nextInt();
		System.out.print("Minute = ");
		minute=sc.nextInt();
		angle=findAngle(hour,minute);
		System.out.println(angle);
	}
	public static double findAngle(int hr, int min)
	{
		int Hr,diff,cpy;
		double degree=0.0,deg=0.0;
		Hr=hr*5;
		diff=Math.abs(Hr-min);
		if(diff>0)
		{
			degree=diff*6.0;
			cpy=min;
			while(cpy>0)
			{
				deg=deg+0.5;
				cpy=cpy-1;
			}
			if(Hr>min)
			{
				degree=degree+deg;
			}
			else if(Hr<min)
			{
				degree=degree-deg;
			}
			return degree;
		}
		else
			return degree;
	}				
}