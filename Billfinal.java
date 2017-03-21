public class Billfinal{
	public static void main(String [] args){
	int pm = Integer.parseInt(args[0]);
	int wnm = Integer.parseInt(args[1]);
	float  total=0;
	if (pm <= 400 && wnm <=750){
		System.out.println("you have to pay"+ 29.5);
	}
	else {
		pm = pm - 400;
		wnm = wnm - 750;
		total = pm + wnm ;
		total = (float)(total * 0.40);
		total = (float)(total + 29.5);
		}
	System.out.println("your bill is "+ total);
	}	
}