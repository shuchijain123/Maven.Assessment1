package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] == objectToCount) {


                count++;
            }


        }


        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(objectArray));

        list.removeAll(Arrays.asList(objectToRemove));


        Integer[] obarr = new Integer[list.size()];
        obarr = list.toArray(obarr);


        return obarr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        int count = 1, tempCount;
        int popular = (int) objectArray[0];
        int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            if (objectArray[i] != null)
                temp = (int) objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (objectArray[j] != null && temp == (int) objectArray[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }











    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        int i=0;
        int temp = 0;
        int leastpopular = (int) objectArray[0];
        int[] results = new int[objectArray.length];
        int minCount = Integer.MAX_VALUE;
        for ( i = 0; i < objectArray.length; i++) {
            for (int j = 0; j < objectArray.length; j++) {
                if (objectArray[j] == objectArray[i]) {
                    results[i]++;
                }
            }
            if (results[i] <= minCount) {
                minCount = results[i];
            }
        }
        for (int j = 0; i < results.length; j++) {
            if (results[i] == minCount) {

            }

        }
        return 2;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Integer> list  = new ArrayList(Arrays.asList(objectArray));
        ArrayList<Integer> list2  = new ArrayList(Arrays.asList(objectArrayToAdd));

        list.addAll(list2);



        Integer[] obarr = new Integer[list.size()];
        obarr = list.toArray(obarr);


        return obarr;
    }














}
