
public class Prime
{
	public static void main (String [] args)
	{
		int a=10;
		boolean flag=true;
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
				flag=false;
				break;
		}
		if(flag)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not Prime");

	}
}