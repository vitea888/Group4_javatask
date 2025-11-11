package hishge;

/*
      QUESTION 1 -Numbers  ---Odd & Even
       Write a method which can identify if a given number odd or even

       Ex:
       identify(5) -->"Odd"
       identify (6) --> "Even"
      */

public class Task1 {

    public static String identify(int n){
        if (n == 0){
            return "not valid";
        } else if (n < 0){
            return "negative";
        } else if (n % 2 == 0 ){
            return "even";
        } else { return "odd";}
    }

    public static void main(String[] args) {
        int n = -86;
        System.out.println(identify(n));
    }
}
