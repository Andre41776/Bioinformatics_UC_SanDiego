package weekOne.stepThree;

public class PatternRC {
    public static String getReverseStrand (String pattern) {
        StringBuilder reversePattern = new StringBuilder();
        for (int i = pattern.length()-1; i >= 0; i--){
            switch (pattern.charAt(i)) {
                case 'A':
                    reversePattern.append('T');
                    break;
                case 'T':
                    reversePattern.append('A');
                    break;
                case 'C':
                    reversePattern.append('G');
                    break;
                case 'G':
                    reversePattern.append('C');
                    break;
            }
        }
        return reversePattern.toString();
    }
}

