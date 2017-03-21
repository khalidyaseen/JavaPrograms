import java.util.*;
public class mor{
	public static void main(String [] args){
	double principal = Double.ParseDouble(args[0]);
	double rate = Double.ParseDouble1(args[1]);
	integer years = Integer.ParseInt(args[2]);	
	integer N;
	double R;	
	double temp;
	double monthlypayment;
	N = years * 12;
	R = (rate)/(12*100);
	temp = Math.pow(1+R,-N);
	monthlypayment = principal * (R/1-temp);
	System.out.println(monthlypayment);
	}
}