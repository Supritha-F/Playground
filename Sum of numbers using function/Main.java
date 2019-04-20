import java.util.Scanner;
class Main{
  public static int sum_of_num(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      num= sum_of_num(num);
      System.out.println(num);
	    
	}
}