import java.util.*;
public class mor{
	public static void main(String [] args){
	double principal = Double.parseDouble(args[0]);
	double rate = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);	
	int N;
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