import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter your variables");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();

		System.out.println(free(word));

	}
	public static boolean free (String gree){
		int length =gree.length();


		if (length % 2  == 0){
			return true;
		}else 
			System.out.println("odd");
		return false;	
	}


}


