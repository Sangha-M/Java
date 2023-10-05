import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in); 
    System.out.print("Enter two numbers");
    
    //takes the input from your keyboard
    
   double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    //prints the numbers 
    System.out.println("number is " + (num1+num2));

    //closes the scanner
    input.close();
    
  }
}
//even or odd 
/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in); 
    System.out.print("Enter a number");
    
    //takes the input from your keyboard
    
   int num1 = input.nextInt();
    
 if(num1%2==0)

 {//prints the numbers 
    System.out.println("number is even");
 }
  
else
  {
    System.out.println("number is odd");  
  }
   
   //closes the scanner
    input.close();
    
  }
}*/
