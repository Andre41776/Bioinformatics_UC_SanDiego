package weekOne.stepThree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PatternMatching {
    /*public static void main(String[] args) throws IOException {
        ClassLoader classLoader = PatternMatching.class.getClassLoader();
        File file = new File(classLoader.getResource("Vibrio_cholerae.txt").getFile());
        String genes = new String(Files.readAllBytes(file.toPath()));
        System.out.println(genes.length());
        int count = 0;
        StringBuilder result = new StringBuilder(); String doesn't work because it does not allow for
        getPatternMatching("CTTGATCAT", genes, count, result);
        System.out.println(count);
        System.out.println(result.toString());
    }
    public static void getPatternMatching(String pattern, String genome, int count, StringBuilder result){
        List<Integer> startingIndex = new ArrayList<Integer>();
        for (int i=0; i <= genome.length()-pattern.length(); i++){
            if (genome.startsWith(pattern, i)){
                startingIndex.add(i);
                count += 1;
            }
        }
        result.append(startingIndex.toString().replace(","," "));

    }*/

    public static ArrayList<Integer> getPatternMatching(String pattern, String genome){
        ArrayList<Integer> startingIndex = new ArrayList<Integer>();
        for (int i=0; i <= genome.length()-pattern.length(); i++){
            if (genome.startsWith(pattern, i)){
                startingIndex.add(i);
            }
        }
        return startingIndex;
    }


}
