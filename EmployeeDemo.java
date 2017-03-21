//package khalid;
import khalid.*;
public class EmployeeDemo
{
	public static void main(String args [])
	{
		Employee e1,e2;
		e1 = new Employee();
		e1 = new Employee();
		e1.name = "khalid";
		e1.address = "jammu and kashmir";
		e1.number = 111;
		//=1313543;
		e1.salary=10000.00;
		System.out.println(e1.computePay()); 
	
		e2 = new Employee();
		e2 = new Employee();
		e2.name = "adil";
		e2.address = "pakistan";
		e2.number = 313;
		//e2.SSN=64644;
		e2.salary=20000.00;
		System.out.println(e2.computePay());
		e2.mailCheck();
	}
}