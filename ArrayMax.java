class ArrayMax{
public static void main(String args[])
{
int a[]={10,2, 3, 4, 5};
int max=a[0];
for(int i=1;i<a.length;i++)
{ if(a[i]>max)
  max=a[i];
}
System.out.println("Max is"+max);
}
}