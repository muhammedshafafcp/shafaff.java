class InvalidAgeExeption extends Expection{
public InvalidAgeExeption(String message){
super(message);
}
}
public class ExeptionHandlingDemo{
public static void validateAge(int age)
throws InvalidAgeExeption{
if(age<18){
throw new 
InvalidAgeExeption("Access denied:you must be at least 18 years old");
} else{
System.out.println("access granted :age verified");
}
}
public static void main(String[]args){
int[]userAges={21,15};
for(int age:userAges){
System.out.println("\nChecking age:"+age);
try{
validateAge(age);
if(age==21){
int result=10/0;
}
}
catch(InvalidAgeExeption e){
System.out.println("custom exception caught:"+e.getMessage());
}
catch (ArithmeticException e){
System.out.println("runtime exception cought:Cannot divide by zero");
}
catch(Expection e){
System.out.println("general exception caought:"+e.getMessage());
}
finally{
System.out.println("Cleanup:Age check processing completed");
}
}
}
}
