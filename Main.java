import java.util.Scanner; // import

/*
1.10 notes
Calling static methods:
static methods are also called class methods, only one copy of every method, for example the amin method is always static

template for a static method: 
public static returnType methodName(parameters){ //header
   //body
}
non-void methods:
different from void methods that do not return a value
The return statement in a non-void method: 1.sends a value back to the caller 2. Must return a data type that matches the return type in the method header 3. ends method execution immediately

when calling non-void methods, you must do somthing with the return value, you can either store the output in a variable , or use it in an expression directly
common errors: forgetting to use the return value, mismatched types, incoreect arguement types / order
if we call a method from a different class, we need to include it's class name iwth the dot'.' operator
*/
public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); //creating scanner
      int num1 = scan.nextInt(); // input 1
      int num2 = scan.nextInt(); //input 2
      
      int result = num1 * num2; //calculation of input 1 times input 2
      
      System.out.println(num1 + " x " + num2 + " = " + result); //printing product

   
   }
}

