package com.zipcodewilmington.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {




      String s1 = str.substring(0,1).toUpperCase();
        String capstring = s1 + str.substring(1);







        return capstring;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";



        for (int i=str.length()-1; i>=0;i--){

            reverse = reverse+str.charAt(i);



        }

        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

       BasicStringUtils bu = new BasicStringUtils ();

        String reversestring = bu.reverse(str);

        String Camcase = bu.camelCase(reversestring);



          return Camcase;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        str = str.substring(1,str.length()-1);

        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char [] carr = str.toCharArray();

        for (int i=0 ; i< carr.length; i++)
        {
            if (Character.isUpperCase(carr[i])){

                carr[i]= Character.toLowerCase(carr[i]);
            }


            else if (Character.isLowerCase(carr[i])){

                carr[i]= Character.toUpperCase(carr[i]);
            }
        }
        return new String(carr);
    }
}
