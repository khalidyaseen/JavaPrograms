import java.util.*;
public class input{

	public static void main(String [] args)
		{

			Scanner i = new Scanner(System.in);
			int a;
			float b;
			String c;

			 System.out.println("enter ur integer number");
			 a = i.nextInt();
			 System.out.println("the number entered is " + a);

			 System.out.println("enter the string");
			 c = i.nextLine();
			 System.out.println("the string is " + c);

			 System.out.println("enter the float number");
			 b = i.nextFloat();
			 System.out.println("the floating number is" + b);
		}
	
}