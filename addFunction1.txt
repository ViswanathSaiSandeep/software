import java.util.Scanner;
public class addFunction1{
	        static int add(int x, int y){
		int z=x+y;
		return z;
	}
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a,b values: ");
		a=s1.nextInt();
		b=s1.nextInt();
		c=addFunction1.add(a,b);
		System.out.println(c);
	}
}