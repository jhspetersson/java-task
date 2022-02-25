package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        var len = str.length();
        var endPos = len;

        for (var i = len - 1; i >= 0 && Character.isSpaceChar(str.charAt(i)); i--) {
            endPos = i;
        }

        for (var i = endPos - 1; i >= 0; i--) {
            if (Character.isSpaceChar(str.charAt(i))) {
                return endPos - i - 1;
            }
        }

        return len;
    }
}
