import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int fd=num/100;
    int sd=(num%100)/10;
    int td=num%10;
    int rev=(td*100)+(sd*10)+fd;
    System.out.println(rev);
  }
}