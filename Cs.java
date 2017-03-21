public class Cs{
	public static void main(String [] args){
                //String s=args[0];
		char grade = args[0].charAt(0);
		if (grade == 'A'){System.out.println("Excellent");}
		else if (grade == 'B'){System.out.println("very good");}
		else if (grade == 'c'){System.out.println("good");}
		else if (grade == 'D'){System.out.println("satisfactory");}
		else if (grade == 'e'){System.out.println("failed");}
		else {System.out.println("wrong grade");}	
	
	}

}