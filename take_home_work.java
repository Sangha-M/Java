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

//Part B 
//Question 1

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

//Part B 
//Question 2

