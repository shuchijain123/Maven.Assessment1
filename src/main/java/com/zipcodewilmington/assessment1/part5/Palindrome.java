package com.zipcodewilmington.assessment1.part5;
import java.util.AbstractCollection;
import java.lang.*;
import java.util.Iterator;
import java.util.HashSet;

public class Palindrome {

    public Integer countPalindromes(String input) {

        HashSet<String> pal = new HashSet<String>();

        for (int i = 0; i < input.length(); i++) {
            pal.add(String.valueOf(input.charAt(i)));
            for (int j = i - 1, k = i + 1; j >= 0 && k < input.length(); j--, k++) {

                if ((new Character(input.charAt(i))).equals(new Character(input.charAt(j)))) {
                    pal.add(input.substring(j, i + 1));
                }
                // String of lenght 2 as palindrome
                if ((new Character(input.charAt(i))).equals(new Character(input.charAt(k)))) {
                    pal.add(input.substring(i, k + 1));
                }
                if ((new Character(input.charAt(j))).equals(new Character(input.charAt(k)))) {
                    pal.add(input.substring(j, k + 1));
                } else {
                    continue;
                }
            }
        }

        Iterator<String> distinctPlnItr = pal.iterator();
        while (distinctPlnItr.hasNext()) {
            System.out.print(distinctPlnItr.next() + ",");
        }
        return pal.size();

    }


}
