import java.util.Scanner;
public class addFunction2{
	        static void add(int x, int y){
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a,b values: ");
		a=s1.nextInt();
		b=s1.nextInt();
		addFunction2.add(a,b);
	}
}