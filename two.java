import java.util.Scanner;
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter a number");
Scanner scanner = new Scanner(System.in);
int num1 = scanner.nextInt();

if(num1 % 2 == 0){
	if(num1 % 3 ==0){
		System.out.println("True");
	}
	else
		System.out.println("false");
}
	}

}
