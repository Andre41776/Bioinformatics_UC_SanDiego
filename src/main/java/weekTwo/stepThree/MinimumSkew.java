package weekTwo.stepThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSkew {
    public static List<Integer> minimumSkew(String genome){
        List<Integer> skew = new ArrayList<>();
        for (int i=0; i<genome.length(); i++){
            switch (genome.charAt(i)){
                case 'C':
                    skew.add(skew.get(i-1)-1);
                case 'G':
                    skew.add(skew.get(i-1)+1);
                default:
                    skew.add(skew.get(i-1));
            }
        }

        return skew;
    }
}
