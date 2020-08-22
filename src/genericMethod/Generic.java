package genericMethod;

public class Generic {

	public static void main(String[] args) {
		
		Integer[] number = {1,8,9,6,6};
		Character[] chars = {'a','e','i','o'};
		String[] words = {"Hello","Hi","test","not"};
		
		printArray(number);

	}
	
	public static <Z> void printArray(Z[] x){
		for(Z item : x){
			System.out.println(item);
		}
	}
	

}
