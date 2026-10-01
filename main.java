import java.util.Scanner;
public class main{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a string");
String str=sc.nextLine();
int maxLength=0;
for(int=0;i<str.length();i++)
{
String current="";
for(int j=i;j<str.length();j++)
{
char ch=str.charAt(i);
if(current.indexOf(ch)!=-1){
break;
}
current+=ch;
if(current.length()>maxLength){
maxLength=current.length();
}
}
}
System.out.println("length of longest substring:"+maxLength);
}
}
                               