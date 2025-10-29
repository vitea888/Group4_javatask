package mihajlo;
/*
      QUESTION 1 -Numbers  ---Odd & Even
       Write a method which can identify if a given number odd or even

       Ex:
       identify(5) -->"Odd"
       identify (6) --> "Even"
      */
public class Task1 {

    public static String oddOrEven(int num){
        if (num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));
    }
}
