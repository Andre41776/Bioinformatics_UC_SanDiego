package weekOne.stepFour;

import weekOne.stepFiveCSFreqArr.ComputingFrequencies;
import weekOne.stepSixCSConvPatt.NumberToPattern;

import java.util.ArrayList;
import java.util.List;

public class ClumpFinding {

    public static List<String> clumpFinding(String text, int k, int L, int t ){
        List<String> frequentPatterns = new ArrayList<>();
        int[] clump = new int[(int)Math.pow(4,k)];
        for (int i=0; i<clump.length; i++){

            clump[i]=0;

        }

        for (int i=0; i<=text.length()- L; i++){
            String window = text.substring (i, i+L);
            int[] frequencyArray = ComputingFrequencies.computingFrequencies(window, k);
            for (int index = 0; index <=clump.length-1; index++){
                if (frequencyArray[index] >= t){
                    clump[index] = 1;
                }
            }
        }
        for (int i=0; i<=clump.length-1; i++){
            if(clump[i] == 1){
                String Pattern = NumberToPattern.numberToPattern(i,k);
                frequentPatterns.add(Pattern);
            }
        }
        System.out.println(frequentPatterns.size());
        return frequentPatterns;


    }
}



