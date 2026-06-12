public class Solution { // the class holds the solution
    public boolean isAnagram(String s, String t) {  //the boolean function 
        if (s.length() != t.length()) { // if  two strings are not the same length, return false
            return false;
        }

        char[] sSort = s.toCharArray(); // convert the first string to an array 
        char[] tSort = t.toCharArray(); // convert the second string to an array
        Arrays.sort(sSort); // sort the first array 
        Arrays.sort(tSort); // sort the second array 
        return Arrays.equals(sSort, tSort); // return true if both sorted arrays are identical, otherwise return false
    }
}