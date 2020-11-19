package weekOne.stepTwo;

import java.util.*;

public class FrequentWords {

    public static void main(String[] args) {

    }

    /**
     * Takes a String and an Integer and slides a window to check all
     * repetitions of substrings of the Integer length in
     * @param text a string with
     * @param k an integer with
     * @return
     */


    public static ArrayList<String> getFrequentWords(String text, int k){
        Set<String> frequentPatterns = new LinkedHashSet<>();
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i <= text.length() - k; i++){
            String pattern= text.substring(i, i + k);
            count.add(PatternCount.getPatternCount(text, pattern));
        }
        Integer maxCount= Collections.max(count);
        for (int i = 0; i <= text.length() - k; i++){
            if(count.get(i) == maxCount){
                frequentPatterns.add(text.substring(i, i+k));
            }
        }

        return new ArrayList<String>(frequentPatterns);

    }

    /*    ArrayList<String> frequentPatterns = new ArrayList<>();
    ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i <= text.length() - k; i++){
        String pattern= text.substring(i, i + k);
        count.add(PatternCount(text, pattern));
    }
    Integer maxCount= java.util.Collections.max(count);
        for (int i = 0; i <= text.length() - k; i++){
        if(count.get(i) == maxCount){
            frequentPatterns.add(text.substring(i, i+k));
        }
    }

        return new ArrayList<>(frequentPatterns.stream().distinct().collect(java.util.stream.Collectors.toList()));

*/
}
