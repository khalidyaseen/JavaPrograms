//factorial program using command line args
import java.util.*; 
class factorial
{
 	public static void main(String [] args)
 	{
 		int i,j,fact=1;
 		Scanner ob = new Scanner(System.in);
 		i = ob.nextInt();
 		if(i==0||i==1)
 		{
 			System.out.println("chill");
 		}
 		else
 		{
 			 for(j=i;j>0;j--)
 			 {
 			 	fact = fact*j; 
 			 }
 		}
 		System.out.println("factorial of " + i + "is" + fact);
 	}
}