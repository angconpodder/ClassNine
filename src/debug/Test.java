package debug;

public class Test {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		
		System.out.println(a+b);
		
		a=15;
		b=20;
		
		System.out.println(a+b);
		
		sum(9,15);
		
		System.out.println("done");

	}
	
	public static void sum(int a, int b){
		System.out.println(a+b);
	}

}
