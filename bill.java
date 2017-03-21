public class bill{
	public static void main(String [] args)
	{
		int peak = Integer.parseInt(args[0]);
		int week = Integer.parseInt(args[1]);
		double p_extra = 0,w_extra=0,total_cost=0;
		//System.out.println("value of peak and week is" + peak + "\t" + week);
		float monthly_charge = 29.95F;
		if(peak>400)
		{
			p_extra = peak - 400;
			System.out.println("u have " + p_extra + "extra minutes");
			p_extra = p_extra * 0.40;
		}
		else
			System.out.println("u have no extra minutes for peak calls");
		if(week>750)
		{
			w_extra = week - 750;
			System.out.println("u have " + w_extra + "extra minutes");
			w_extra = w_extra * 0.40;
		}
		else
			System.out.println("u have no extra minutes for week calls");

		total_cost = 29.5 + p_extra + w_extra;

		System.out.println("your total cost is "+total_cost+"$");
	}

}

// here is the comment 

//calculating taxes