package com.zipcodewilmington.assessment1.part2;


import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils extends BasicStringUtils {




    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {




        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String firstword = "";

        String [] strarr = sentence.split(" ");

        for (int i=0; i<strarr.length;i++){
            firstword = strarr[0].toString();


        }

        return firstword;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

         BasicStringUtils bu = new BasicStringUtils ();
        StringUtils su = new StringUtils();

        String firword = su.getFirstWord(sentence);
        String revword = bu.reverse(firword);

         return revword;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        BasicStringUtils bu = new BasicStringUtils ();
        StringUtils su = new StringUtils();
        String revword = su.reverseFirstWord(sentence);
        String camel = bu.camelCase(revword);
        return camel;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        BasicStringUtils bu = new BasicStringUtils ();
        StringUtils su = new StringUtils();

        StringBuilder sb = new StringBuilder(str);


        sb.deleteCharAt(index);

        String result = sb.toString();


        return result;

    }

}
