package weekOne.stepTwo;

public class PatternCount {
    /**
     * Takes two strings and finds how many instances of one appears
     * in the other.
     * @param text string to be explored for repetitions of pattern
     * @param pattern string that defines the substring that will be
     *                searched in text
     * @return the number of times pattern appears in text
     */
    public static int getPatternCount(String text, String pattern) {

        int count = 0;
        for (int i = 0; i <= (text.length() - pattern.length()); i++) {
            /**
             * startsWith() checks if pattern, a possible substring of
             * text, appears or rather starts at specified index i. If
             * it does it adds 1 to count
            */
            if (text.startsWith(pattern, i)) {
                count += 1;
            }
        }
        return count;
    }

}
