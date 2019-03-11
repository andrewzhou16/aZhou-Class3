//whenever you make a new class it starts with public class: lesson
//syntax: curly braces represent seperate blocks of code
//indent before and after curly braces
//data types-int,double, boolean,string, float, char are used for this class
//Strings are different than other types because they begin with a capital S
//all strongs have a capital, that is how they are recognized
//everything you type for now must be inbetween curly braces
//public functions-accessibility by others
//static functions-running a method without creating instants of import junit.framework.TestCase;
//void functions-the function will not return any result
//main- the name you give a function
//indent using tab before public
// whenever you make changes save and recomplile
 public class lesson{
   public static void main(String[] args){
     System.out.println("hi");
     int a=5;
    // double a=2.4;
     int b=5+3;
     System.out.println(a);
     String x=new String("hello");
      System.out.println(x);
      //java looping- For Loop and White looping
      //For Loop for(int i=0;i<10;i++)()}
      //i++ can also be written as i=i+1
      for(int i=0;i<10;i++){
        System.out.println(i);

      }
      int j=0; while(j<10){
        System.out.println(j);
        j++;
      }
      for(int z=10;z<20;z+=2){
        System.out.println(z);
      }
      int y=10; while(y<21){
        System.out.println(y);
        y+=2;
      }
//% means remainder, so 7%2 =1
//+=1
      //conditionals include "ifs" "else if" and "else"
      //when checking for variables use "==", this does not work for String
      //if you have an "if" statement, an "else" must come right after or not at all
      // "else" encompasses everything else before the statement
      // "else" refers and applies to every statement before import junit.framework.TestCase;
      for(int g=0;g<101;g+=2){
        System.out.println(g);

      }
      String light= new String("green");
      if (light.equals("green")){
        System.output("light is green!");
}
}
}
