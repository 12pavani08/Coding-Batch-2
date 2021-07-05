import java.util.*;
class array1
{
public static void main (String args [])
{
Scanner sc=new Scanner(System.in);
int size,i;
System.out.print("Enter array size:");
size=sc.nextInt();
int ar[];
ar=new int[size];
System.out.print("Enter array elements:");
for(i=0;i<size;i++)
{
ar[i]=sc.nextInt();
}
Array.sort(ar);
System.out.print("minimum element is:"+ar[0]);
}
}
