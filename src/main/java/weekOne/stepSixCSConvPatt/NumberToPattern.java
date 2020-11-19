package weekOne.stepSixCSConvPatt;

public class NumberToPattern {
    public static String numberToPattern(int index, int k){
        if (k==1){
            return numberToSymbol(index);
        }
        int prefixIndex = index/4;
        int r = index%4;
        String symbol=numberToSymbol(r);
        String prefixPattern = numberToPattern(prefixIndex, k-1);
        return prefixPattern.concat(symbol);

    }
    public static String numberToSymbol(int number){
        switch (number){
            case 0:
                return "A";
            case 1:
                return "C";
            case 2:
                return "G";
            case 3:
                return "T";
            default:
                return null;
        }

    }
}
