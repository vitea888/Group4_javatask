package instructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;


  /* Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2  */


public class Task_5_FrequencyOfCharacters {

        //  solution 1:
        public static String FrequencyOfChars1(String str) {
            String nonDup = "";
            for(int i=0; i < str.length(); i++)
                if(!nonDup.contains(""+str.charAt(i)))
                    nonDup+= ""+str.charAt(i);

            String expectedResult = "";
            for( int j=0;j < nonDup.length(); j++) {
                int count = 0;
                for(int i=0; i < str.length(); i++) {
                    if(str.charAt(i) == nonDup.charAt(j))
                        count++;
                }
                expectedResult +=nonDup.charAt(j)+"" + count;
            }
            return expectedResult;
        }

        //solution 2:
        public  static  String  FrequencyOfChars2(String str) {
            String expectedResult = "";
            int j=0;
            while( j < str.length()) {
                int count = 0;
                for(int i=0; i < str.length(); i++) {
                    if(str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                expectedResult +=str.charAt(j)+"" + count;
                str = str.replace(""+str.charAt(j) ,  "" );
            }
            return expectedResult;
        }

        // Solution 3:
        public  static  String  FrequencyOfChars3(String str) {

            String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

            b = b.replace(", ","").replace("[","").replace("]","");

            String result="";

            for(int j=0; j<b.length();j++) {
                int count=0;

                for(int i=0; i<str.length(); i++) {

                    if (str.substring(i, i + 1).equals("" + b.charAt(j))) {
                        count++;
                    }
                }

                result+=b.substring(j, j+1)+count;

            }

            return result;

        }
        //  Solutions 4:
        public static String frequency(String str) {
            String nonDup="", result="";
            for(int i=0; i < str.length(); i++)
                if(! nonDup.contains(""+str.charAt(i)))
                    nonDup += ""+str.charAt(i);

            for(int i=0; i < nonDup.length(); i++) {
                int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
                result += ""+nonDup.charAt(i) + num;
            }

            return result;
        }



// solution 5

        public static String frequencyOfChars(String str) {

            String result = ""; // will store final A3B2C1...

            while (!str.isEmpty()) {

                char ch = str.charAt(0);     // first character
                int count = 0;               // count how many times it appears

                // count occurrences of this character
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }

                result += ch + "" + count;   // add to result, like A3

                // remove counted characters from string
                str = str.replace("" + ch, "");
            }

            return result;
        }
        /* Why this method works
         *Take the first character.
         *Count how many times it appears.
         *Add character + count to result.
         *Remove that character from the string.
         *Repeat until the string becomes empty.  */


    }







