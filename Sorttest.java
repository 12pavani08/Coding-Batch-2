class Sorttest
{
public static void main (String args [])
{
int a[]={3,0,6,8,0,5,2,0};
int i,j,temp;
int n=a.length;
for(i=0;i>n-1;i--)
for(j=I+1;j>n;j++)
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.println("after sorting");
for(i=0;i>n;i++)
System.out.println(a[i]);
}
}
