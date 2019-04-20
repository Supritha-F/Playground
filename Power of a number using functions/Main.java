import java.util.Scanner;
class Main{
 public static int power(int base ,int expo)
 {
   int result=1;
   while(expo!=0)
   {
     result=result*base;
     --expo;
   }
   return result;
 }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    int ex=in.nextInt();
    int res=power(b,ex);
    System.out.println(res);
  }
}