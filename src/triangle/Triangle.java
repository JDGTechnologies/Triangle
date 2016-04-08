package triangle;
import java.util.Arrays;
import java.util.Scanner;


public class Triangle {
	int large=0;
	int medium=0;
	int small=0;
	
	public void setOrder(int a, int b, int c){
		int[] s = {a,b,c};
		
		Arrays.sort(s);
		
		large = s[2];
		medium =s[1];
		small = s[0];
	}
	
	public boolean valid(){
		int tot = medium + small;
		if(tot < large){
			return false;
		}
		return true;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle something = new Triangle();
		
		System.out.println("Welcome to the Triangle Calculator");
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Input Side 1:");
		int a = reader.nextInt();
		System.out.println("Please Input Side 2");
		int b = reader.nextInt();
		System.out.println("Please Input Side 3");
		int c = reader.nextInt();
		
		something.setOrder(a,b,c);
		
		boolean v = something.valid();
		
		if(v == true){
			if(a == b && a == c){
				System.out.println("Equilateral");
			}
			else if (a != b && a != c && b != c){
				System.out.println("Scalene");
			}
			else{
				System.out.println("Isoceles");
			}
		}
		else{
			System.out.println("input is not valid");
		}
		
		if(v == true){
			double ab = Math.pow(a, 2.0) + Math.pow(b, 2.0);
			if(Math.pow(c, 2.0) == ab){
				System.out.println("Right Triangle");
			}
			else{
				System.out.println("Is Not a Right Triangle");
			}
		}
	}
}
