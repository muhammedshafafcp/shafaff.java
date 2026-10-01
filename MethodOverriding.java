class Department{
void run(){
System.out.println("Department is  ongoing");
}
}
class Bca extends Department{
void run(){
System.out.println("bca is ongoing taughfly");
}
}
public class MethodOverriding{
	public static void main(String[]args){
Department D=new Department();
D.run();
Bca B=new Bca();
B.run();
Department obj=new Bca();
obj.run();
}
}
