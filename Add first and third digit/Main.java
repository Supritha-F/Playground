import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      int f1=num/100;
      int l1=num%10;
      int sum=f1+l1;
      System.out.println(sum);
	}
}