class OddEven Thread extends Thread{
int limit;
OddEven Thread(int limit){
this.limit=limit;
}
public void run(){
System.out.println("even numbers:");
for(int i=2;i<=limit;i+=2){
System.out.println(i);
}
System.out.println("odd numbers:");
for(int i=1;i<=limit;i+=2){
System.out.println(i);
}
}
public static void main(String[]args){
int limit=10;
OddEven Thread obj=new OddEven Thread(limit);
obj.start();
}
}
