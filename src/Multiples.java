public class Multiples {
    public static void main(String[] args) {
        final int maxIterations = 1000;
        int numMultiples = 0;
        for(int i = 1;i<maxIterations;i++){
            if (i%3 == 0||i%5 == 0) {
                //System.out.println(i);
                numMultiples++;
            }
        }
        System.out.println(numMultiples);
    }
}
