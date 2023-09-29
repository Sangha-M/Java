class Main {
  public static void main(String[] args) {
double a,b; //intialisation 
    a=6; //declaration 
    b=3; 
  double x = a%b; //modulo operator(remainder)
  System.out.println(x);
  double q=a/b; // arithmatic opperator 
  double y=a/b;
//you need double everywehere to get the decimal point, if not double then it is represented by 2.0 or whaever 
    System.out.println("intreger value is "+q);
    System.out.println("Double value is "+y);


    //next are relational opperators
  System.out.println(1.9<1.19);//this will give true or false 
    System.out.println(120!=4);
     System.out.println(120>4);
        System.out.println(7==3);//== is a comparison opperator whilst = is an assignment 
        System.out.println(120!=4);
     System.out.println(a>=b);
        System.out.println(12<=6);//relational ends 
    

//next code: logical opperators
    System.out.println((5>3) && (8>5)); 
     System.out.println((5<3) && (8<5));
  }
}
