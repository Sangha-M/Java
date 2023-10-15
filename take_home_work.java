//take home assignemnt part A, number 1
/*//Mehtab
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  

      Scanner input=new Scanner(System.in); 
    //the first name, th
    String name1 = "Mehtab";
    //tels the user to enter their name
    System.out.println("Enter your name ");
      String name2=input.nextLine();
    //conditional statement 
    if(name1.equals(name2))
    {
      System.out.print("the names are the same");
    }
    //takes the input from your keyboard

   
 else
    {
      System.out.println("the names are different");
        }


   //closes the scanner
    input.close();
  }
}*/




/*
//Mehtab
//take home assignment part A, number 2

import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 
  
    //tels the user to enter their numbers
    System.out.println("Enter first number ");
    int x = input.nextInt();
    System.out.println("Enter second number ");
    int y = input.nextInt();
    //conditional statement 
    if(x==y)
    {
      System.out.print("the numbers are the same");
    }
    //takes the input from your keyboard

   
 else if(x>y)
    {
      System.out.println((x) + " is greater than " + (y));
        }

    else if(x<y)
      {
        System.out.println((y) + " is greater than " + (x));
          }
   //closes the scanner
    input.close();
  }
}*/





//part A question 3
//Mehtab
//program which tells the user whether they entered two numbers which are equal or greaterthan/lessthan

/* import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner input=new Scanner(System.in); 
    System.out.println("30/2");
    System.out.println("Enter the result for this equation");
    int num1=input.nextInt();
      //Scanner input=new Scanner(System.in); 
if (num1==15)
{
  System.out.println("Correct");
}
 else 
{
  System.out.println("Wrong");
}
   // Scanner input=new Scanner(System.in); 
    //second equation
    System.out.println("77+43");
    System.out.println("Enter the result for this equation");
    int num2=input.nextInt();
    
    if(num2==120) 
    {
      System.out.println("Correct");
    }
    else 
    {
      System.out.println("Wrong");
    }
//third equation
    System.out.println("12+24");
    System.out.println("Enter the result for this equation");
    int num3=input.nextInt();

    if(num3==36) 
    {
      System.out.println("Correct");
    }
    else 
    {
      System.out.println("Wrong");
    }
    
   //closes the scanner
    input.close();
  }
}
*/







//Assignment Part B, Question 1

/* import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Tells the user to enter their province
    System.out.println("What Province are you from?");
    String x = input.nextLine();

    if (x.equals("Ontario")) {
      // Asks for the premier if the province is Ontario
      System.out.println("Who is the Premier of Ontario?");
      String z = input.nextLine();

      if (z.equals("Ford")) {
        System.out.println("Correct");
      } else {
        System.out.println("Incorrect");
      }
//asks the capital city if the province is Ontario
      System.out.println("What is The Capital of Ontario?");
      String t = input.nextLine();

      if(t.equals("Toronto"))
     //User got question corecct
      {
        System.out.println("Correct! Trivia Sucess! :) ");
      }
      else 
        //User got final question wrong
      {
        System.out.println("Wrong, Trivia failled :(");
      }
    } else if (x.equals("Alberta")) {
      // Asks for the capital city if the province is Alberta
      System.out.println("What is the Capital City of Alberta?");
      String y = input.nextLine();

      if (y.equals("Edmonton")) 
      {
        System.out.println("Correct");
      } else 
             {
        System.out.println("Incorrect");
          }
//asks what the bigest city in Alberta is
      System.out.println("What is the biggest city in Alberta?");
      String n = input.nextLine();

if(n.equals("Calgary"))
   //User got final question right
{
  System.out.println("Correct, Trivia Sucess! :) ");
}
      else
   //User got final question wrong
{
  System.out.println("Wrong, Trivia failled :( ");
}
      
    } else {
      System.out.println("No information about this region");
    }

    // Closes the scanner
    input.close();
  }
}
*/


//Assignment Part B, Question 2
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 

    //tels the user to enter their numbers
    System.out.println("Enter first number ");
     //takes the input from your keyboard
    double x = input.nextDouble();
    System.out.println("Enter second number ");
     //takes the input from your keyboard
    double y = input.nextDouble();
    System.out.println("Enter third number ");
     //takes the input from your keyboard
    double z = input.nextDouble();
    
   
//display what the smallest of the three numbers is 
    if(x<=y && x<=z) //conditional statement 

    {
      System.out.print("Smallest number is "+x);
    }
    else if(y<=x && y<=z)
    {
      System.out.println("Smallest number is "+y);
    }
    else
    {
      System.out.println("Smallest numnber is "+z);
    }
   


   //closes the scanner
    input.close();
  }
}
*/





//Assignment Part B, Question 3
/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 

    //tels the user to enter their numbers
    System.out.println("Enter first number ");
     //takes the input from your keyboard
    int x = input.nextInt();
    System.out.println("Enter second number ");
     //takes the input from your keyboard
    int y = input.nextInt();
    System.out.println("Enter third number ");
     //takes the input from your keyboard
    int z = input.nextInt();
    
    //conditional statement 
//display what the largest of the three numbers is 
    if(x>=y && x>=z)

    {
      System.out.print("Largest number is "+x);
    }
    else if(y>=x && y>= z)
    {
      System.out.println("largest number is "+y);
    }
    else
    {
      System.out.println("Largest numnber is "+z);
    }
   


   //closes the scanner
    input.close();
  }
}*/


/*//take home assignment part b, number 4
import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 

    //tels the user to enter their age
    System.out.println("Enter your age?");
    
    int x = input.nextInt(); //takes the input from their keyboard

 
    
   
//display what the smallest of the three numbers is 
    
    if(x<=12){ //conditional statement 
    //tels user if they are a child, teen, adult, or senior citizen
   System.out.print("You are a child");
    }
   
    else if(x>=13 && x<=19){
    
    System.out.println("You are a teenager");
    }
    
    else if(x>=20 && x<=64){
    
     System.out.println("You are an adult");
    }
    else if(x>=65){
    
    System.out.println("You are a senior citizen");
    }
   


   //closes the scanner
    input.close();
  }
}
*/

//Part B, Question 5
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 

    System.out.println("Lets play Rock, Paper, Scissors!    What does player one chose ");
    String x = input.nextLine();
    System.out.println("What does player two choose? ");
    String y = input.nextLine();
    //conditional statement(if statemnt)
    //This will print out a message depending on who wins or loses the game of rock paper scissors
    if(x.equals("Rock") && y.equals("Scissors")){
      System.out.println("player one wins");
    }
   else if (x.equals("Paper") && y.equals("Rock")){
     System.out.println("player One wins"); 
   }
    else if(x.equals("Scissors") && y.equals("Paper")){
      System.out.println("Player one wins");
    }
    else if (x.equals("Scissors") && y.equals("Rock")){
      System.out.println("Player Two Wins");
    }
    else if(x.equals("Rock") && y.equals("Paper")){
        System.out.println("Player Two wins");
      }
    else if(x.equals("Paper") && y.equals("Scissors")){
      System.out.println("Player Two wins");
    }
    else {
      System.out.println("it is a draw");
    }
   


   //closes the scanner
    input.close();
  }
}
*/

//Part B, Question 6
/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      Scanner input=new Scanner(System.in); 

    System.out.println("Choose a Language, E- English, F-French, Es-Spanish, L-Latin, P-Punjabi, etc. ");
    String x = input.nextLine();
    //conditional statement(if statemnt)
    //This will print out a message depending on who wins or loses the game of rock paper scissors
    if(x.equals("E")){
      System.out.println("Hello");
    }
   else if (x.equals("P")){
     System.out.println("ਹਾਜੀ"); 
   }
    else if(x.equals("F")){
      System.out.println("Salut");
    }
    else if (x.equals("Es")){
      System.out.println("Hola");
    }
    else if(x.equals("L")){
        System.out.println("Salve");
      }
    else{
      System.out.println("We solemely apologize for not having your language available");
    }
   //closes the scanner
    input.close();
  }
}
*/
