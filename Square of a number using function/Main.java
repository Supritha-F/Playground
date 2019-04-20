import java.util.Scanner;
class Main
{
  public static int sqr_of_digs(int num)
  {
    int sq=num*num;
    return sq;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int res= sqr_of_digs(n);
      n=res;
      System.out.println(n);
  
	} 
}