package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int ct = 0; //word count is set to 0
        for (int i=0; i < input.length(); i++) {
            //for loop is used
            if (input.charAt(i) == 'y' || input.charAt(i) == 'z') {
                // first if statement checks if there is a y and z in the words given
                if (i < input.length()-1 && !Character.isLetter(input.charAt(i+1)))
                    ct++;
                // this if statement counts
                else if ( i == input.length() -1)
                ct++;
            }
        }

        return ct;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        String phrase = ""; // call the phrase
        phrase += base.replace(remove,""); // take the " base phrase and remove what you want from the phrase

        return phrase; // will give you what is leftover after what you chose to remove
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int is = 0;
        int nt = 0;
        for (int i = 0; i < input.length() -1; i++){
            // for loop for "is"

            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's')
                is++;

    } // for loop for "not"
        for (int i = 0; i < input.length() -2; i++) {
            if (input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't')
                nt++;
        } // we put - 2 in the range to account for stopping word since the last letter won't have 2 letters
        return is == nt;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == 'g' && input.charAt(i - 1) == 'g' && input.charAt(i + 1) == 'g') {

                return true; // when g is to the immediate left and right
            }
            if (input.charAt(i) == 'g' && input.charAt(i - 1) == 'g') {
                return true; // when g is to the left
            }
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                return true; // when g is to the right
            }

        }
        return false; // if all three cases dont apply then it's not happy
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

        int ct = 0;
        for (int i = 0; i < input.length() -2; i++) {
            Character l = input.charAt(i);
            if (input.charAt(i) == l && input.charAt(i + 1) == l && input.charAt(i + 2) == l)
                ct++;

        } //

        return ct;
    }
}
