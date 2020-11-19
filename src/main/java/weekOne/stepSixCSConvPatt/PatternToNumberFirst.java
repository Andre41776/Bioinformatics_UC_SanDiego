package weekOne.stepSixCSConvPatt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class PatternToNumberFirst {
    /**
     * In this case I'm interested in doing permutation with replacement
     * to discover all possible k-mers of k length with a 4 letter alphabet.
     * After I'll screen a text input once to search if any of the possible
     * k-mers appear and count how many times they do. The result will be
     * stored in an HashSet<String, Integer> with a key for every k-mer
     * present in the text and a value that stores the count. This will
     * in turn run trough another function to only store in a new HashSet
     * the keys with max values from the original HashSet.
     *
     * Source of the code I used to build the recursive method:
     * https://www.geeksforgeeks.org/print-all-combinations-of-given-length/
     *
     * The rest of the code and the adaptation of the code above for my
     * specific use case was built by me.
     *
     *
     * @param k number of elements in a given k-mer
     * @param text sequence to count the number of occurences of a given possible k-mer
     * @return HashMap<String, Integer> with all the possible sequences with the max number
     * of occurences
     */

    //F
    static HashMap<String, Integer> frequentWords(int k, String text)
    {
        char[] nucleotides= {'A','G','C','T'};
        int n = nucleotides.length;
        List<String> possibleSequences = new ArrayList<>();
        allKmersOfKLength(nucleotides, "", n, k, possibleSequences);
        HashMap<String,Integer> result = wordRepeats(text, possibleSequences, k);

        return mostFrequentWords(result);
    }

    // The main recursive method
    // to print all possible
    // strings of length k
    public static void allKmersOfKLength(char[] nucleotides,
                                   String zero,
                                   int n, int k, List<String> possibleSequences)
    {

        // Base case: k is 0,
        // print zero
        if (k == 0)
        {
           // System.out.println(zero);
            possibleSequences.add(zero);
            return;
        }

        // One by one add all characters
        // from nucleotides and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i)
        {

            // Next character of input added
            String newNucleotide = zero + nucleotides[i];

            // k is decreased, because
            // we have added a new character
            allKmersOfKLength(nucleotides, newNucleotide,
                    n, k - 1, possibleSequences);
        }

    }
    private static HashMap<String,Integer> wordRepeats (String text, List<String> possibleSequences, int k) {
        HashMap<String, Integer> seqRep = new HashMap<>();
        for (int i = 0; i <= text.length() - k; i++) {
            for (int n = 0; n < possibleSequences.size(); n++) {
                if (possibleSequences.get(n).equals(text.substring(i, i + k))) {
                    if (seqRep.containsKey(possibleSequences.get(n))) {
                        Integer count = seqRep.get(possibleSequences.get(n));
                        count++;
                        seqRep.put(possibleSequences.get(n), count);
                    } else {
                        seqRep.put(possibleSequences.get(n), 1);
                    }
                }

            }
        }
        return seqRep;
    }
    private static HashMap<String,Integer> mostFrequentWords(HashMap<String,Integer> seqRep) {
        HashMap<String, Integer> freqWords = new HashMap<>();
        Integer maxKey = Collections.max(seqRep.values());
        seqRep.forEach((key, value) -> {
            if (value == maxKey) {
                freqWords.put(key, value);
            }

        });
        return freqWords;
    }
    public static void main (String[]args){
        System.out.println(frequentWords(3,"AAGCTTACGGTCAAGCACGTTTAACGCG"));
        System.out.println(frequentWords(2,"AAGCTTACGGTCAAGCACGTTTAACGCG"));

        }
    }

