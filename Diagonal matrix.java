import java.util.Scanner;
class Array
{
public static void main(String args [])
{
  Scanner sc=new Scanner (System.in);
  System.out.println("enter row");
  int r=sc.nextInt();
   System.out.println("enter new column");
    int c=sc.nextInt();
    int ar[][]=new int[r][c];
    if(r==c)
{
  System.out.println("diagonal matrix");
}
else
{
System.out.println("not diagonal matrix");
}
}
}
