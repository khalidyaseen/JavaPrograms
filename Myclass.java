public class Billfinal{
	public static void main(String [] args){
	int pm = Integer.ParseInt(args[0]);
	int wnm = Integer.ParseInt(args[1]);
	float  total ;
	if (pm <= 400 && wnm <=750){
		System.out.println("you have to pay"+ 29.5);
	}
	else {
		pm = pm - 400;
		wnm = wnm - 750;
		total = pm + wnm ;
		total = total * 0.40;
		}
	}	
}