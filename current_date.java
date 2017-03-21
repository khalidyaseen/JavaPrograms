import java.util.*;
class current_date{
	public static void main(String[] args)
	{  
		int day,month,year;
		int sec,min,hour;
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		sec = date.get(Calendar.SECOND);
		min =  date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		System.out.println("day month and year are"+day+" / "+month+" / "+year);
		System.out.println("second minute and hour are"+hour+" / "+min+" / "+sec);
	}
}