import java.util.Scanner;
class MethodOverloading
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
MethodOverloading obj=new MethodOverloading();
System.out.print("enter first number:");
int n1=sc.nextInt();
System.out.print("enter second number:");
int n2=sc.nextInt();
System.out.println("sum of two numbers="+obj.add(n1,n2));
System.out.println("\n enter third number:");
int n3=sc.nextInt();
System.out.println("sum of three numbers="+obj.add(n1,n2,n3));
System.out.println("enter first decimal number:");
double d1=sc.nextDouble();
System.out.println("enter second decimal number:");
double d2=sc.nextDouble();
System.out.println("sum of two decimal numbers="+obj.add(d1,d2));
sc.close();
}
}
