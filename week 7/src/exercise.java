import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Exercise 1");
		int max=5;
		int n=1;
		while (n<=max) {
			System.out.println(n);
			n=n+1;
		}
		System.out.println();
		
		System.out.println("Exercise 2");
		int total = 25;
		int number=1;
		while (number <= (total / 2)) {
			total = total - number;
		    System.out.println(total + " " + number);
		    number=number+1;
		}
		System.out.println();
		
		System.out.println("Exercise 3");
		int i=1;
		while (i <= 2) {
			int j=1;
			while (j <= 3) {
				int k=1;
				while (k <= 4) {
					System.out.print("*");
					k=k+1;
				}
				System.out.print("!");
				j=j+1;
			}
			 System.out.println();
			 i=i+1;
		}
		System.out.println();
		
		
		System.out.println("Exercise 4");
		int num = 4;
		int count=1;
		while (count <= num) {
			System.out.println(num);
		    num = num / 2;
		    count=count+1;
		}
	}	
}
	


