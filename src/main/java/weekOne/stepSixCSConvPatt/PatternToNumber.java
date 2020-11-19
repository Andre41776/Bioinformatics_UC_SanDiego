package weekOne.stepSixCSConvPatt;

public class PatternToNumber {
    public static int patternToNumber(String pattern) {
        if (pattern.isEmpty()) {
            return 0;
        }
        char symbol = pattern.charAt(pattern.length()-1);
        String prefix = pattern.substring(0,pattern.length()-1);
        return 4* patternToNumber(prefix) + symbolToNumber(symbol);

    }

    public static Integer symbolToNumber(char symbol) {
        switch (symbol) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return null;
        }
    }
}
