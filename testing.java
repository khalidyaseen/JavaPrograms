class A {
public static void bar() {
System.out.println( "A" );
}
}
class B extends A {
public static void bar() {
System.out.println( "B" );
}
}

class testing{
	 public static void main(String[] args) {
		A test = new B();
		test.bar();
	}
}