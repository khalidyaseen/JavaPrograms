public class temp{

	public static void main(String [] args)
	{
		double F = Double.parseDouble(args[0]);
		double C=0;
		C=(5.0/9)*(F-32);
		System.out.println("The temperature in celcius is " + C);
	}

}