package weekOne.stepFiveCSFreqArr;

import weekOne.stepSixCSConvPatt.PatternToNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComputingFrequencies {

    public static int[] computingFrequencies(String text, int k){

        int[] frequencyArray = new int[(int)Math.pow(4,k)];
        for (int i=0; i<=Math.pow(4,k)-1; i++){

            frequencyArray[i]=0;

        }
        for (int i=0; i<=text.length()- k; i++){

            String pattern = text.substring(i,i+k);
            int j = (int)PatternToNumber.patternToNumber(pattern);
            int fAJ= frequencyArray[j];
            frequencyArray[j] = fAJ+1;

        }
        return frequencyArray;
    }
}
